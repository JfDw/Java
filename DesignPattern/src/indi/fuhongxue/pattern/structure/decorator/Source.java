package indi.fuhongxue.pattern.structure.decorator;

/**
 * Source�ӿ�ʵ���ࡣ
 * @author 1HBLSQT
 *
 */
public class Source implements Sourceable {

	@Override
	public void method() 
	{
		System.out.println("the original method!");
	}
}
