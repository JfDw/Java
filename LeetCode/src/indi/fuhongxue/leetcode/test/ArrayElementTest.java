package indi.fuhongxue.leetcode.test;

import org.junit.Assert;
import org.junit.Test;
import indi.fuhongxue.leetcode.arrays.ArrayElement;
import indi.fuhongxue.leetcode.arrays.ArrayUtils;

//@RunWith(Parameterized.class)
public class ArrayElementTest 
{
//	private int[] array;
//	private int element;
//	
//	
//	public ArrayElementTest(int[] array, int element)
//	{
//		this.array = array;
//		this.element = element;
//	}
//
//	@Parameters
//	public static int[][][] arrays()
//	{
//		return new int[][][]{{{1,2,2,2,2,2,4,3,3,4,6},{2}},
//			{{1,2,3,4,5},{6}}};
//	}
	
	@Test
	public void testRemoveElement() {
//		fail("Not yet implemented");
//		int[] array = new int[]{1,2,2,2,2,2,4,3,3,4,6};
		int[] array = new int[]{1,2,3,4,5,6};
		int length = ArrayElement.removeElement(array,8);
		
		//验证长度
		Assert.assertEquals(length,6);
		//打印结果
		ArrayUtils.printArray(array, length);
	}
	
	@Test
	public void testRemove()
	{
//		int[] array = new int[]{1,2,2,2,2,2,4,3,3,4,6};
		int[] array = new int[]{1,2,3,4,5,6,1};
		int length = ArrayElement.remove(array,1);
		
		//验证长度
		Assert.assertEquals(length,5);
		//打印结果
		ArrayUtils.printArray(array, length);
	}

}
