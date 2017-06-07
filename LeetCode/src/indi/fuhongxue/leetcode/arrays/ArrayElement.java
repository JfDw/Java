package indi.fuhongxue.leetcode.arrays;
/**
 * ����Ԫ���������
 * 
 * @author 1HBLSQT
 *
 */
public class ArrayElement 
{
	/**
	 * ���������Ƴ�������Ԫ�أ���ֹ�½����顣
	 * 
	 * @param array
	 * 		����
	 * @param elementRemoved
	 * 		����Ԫ��
	 * @return
	 * 		�Ƴ�����Ԫ�غ�����鳤��
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
