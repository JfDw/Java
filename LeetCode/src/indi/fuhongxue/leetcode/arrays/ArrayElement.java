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
		
		for(int i = 0 ; i < array.length ;  i++)
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
	
	/**
	 * my own method
	 * 
	 * @param array
	 * 		 input array
	 * @param element
	 * 		 element to be deleted
	 * @return 
	 * 		 the length of array
	 */
	public static int remove(int[] array, int element)
	{
		//indicate to the element to be removed
		int index = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] != element)
			{
				array[index] = array[i];
				index++;
			}
		}
		
		return index;
	}

}
