package indi.fuhongxue.leetcode.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import indi.fuhongxue.leetcode.arrays.ArrayElement;
import indi.fuhongxue.leetcode.arrays.ArrayUtils;

public class ArrayElementTest 
{

	@DataProvider
	public int[][][] remove()
	{
		return new int[][][]{
			{{1,2,2,2,2,2,4,3,3,4,6},//����
			{2},					 //��ɾ��Ԫ��
			{6}						 //�ڴ����鳤��
			},
			{{1,2,3,4,5},{5},{4}}};
	}
	
	@Test(dataProvider="remove")
	public void testRemoveElement(int[] array, int[] element,int[] expectedLength) {
		int length = ArrayElement.removeElement(array,element[0]);
		
		//��֤����
		AssertJUnit.assertEquals(length,expectedLength[0]);
		//��ӡ���
		ArrayUtils.printArray(array, length);
	}
	
	@Test(dataProvider="remove")
	public void testRemove(int[] array, int[] element,int[] expectedLength)
	{
		int length = ArrayElement.remove(array,element[0]);
		
		//��֤����
		AssertJUnit.assertEquals(length,expectedLength[0]);
		//��ӡ���
		ArrayUtils.printArray(array, length);
	}

}
