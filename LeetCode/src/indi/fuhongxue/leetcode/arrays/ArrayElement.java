package indi.fuhongxue.leetcode.arrays;
/**
 * 数组元素相关试题
 * 
 * @author 1HBLSQT
 *
 */
public class ArrayElement 
{
	/**
	 * 从数组这移除给定的元素，禁止新建数组。
	 * 
	 * @param array
	 * 		数组
	 * @param elementRemoved
	 * 		给定元素
	 * @return
	 * 		移除给定元素后的数组长度
	 */
	public static int removeElement(int[] array,int elementRemoved)
	{
		int index = 0;
		
		for(int i = 0 ; i< array.length;  i++)
		{
			if(elementRemoved == array[i])
			{
				continue;
			}
			
			array[index] = array[i];
			index++;
		}
		
		return index;
	}
	
	public static void printArray(int[] array,int length)
	{
		for(int i =0;i<length;i++)
		{
			System.out.print(" "+array[i]);
		}
	}

}
