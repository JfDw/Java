package indi.fuhongxue.leetcode.test;

import org.junit.Assert;
import org.junit.Test;

import indi.fuhongxue.leetcode.arrays.ArrayElement;

public class ArrayElementTest {

	@Test
	public void testRemoveElement() {
//		fail("Not yet implemented");
		int[] array = new int[]{1,2,2,2,2,2,4,3,3,4,6};
		int length = ArrayElement.removeElement(array,2);
		
		//验证长度
		Assert.assertEquals(length,6);
		//打印结果
		ArrayElement.printArray(array, length);
	}

}
