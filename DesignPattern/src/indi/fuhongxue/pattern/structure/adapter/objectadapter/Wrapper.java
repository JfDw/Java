package indi.fuhongxue.pattern.structure.adapter.objectadapter;

import indi.fuhongxue.pattern.structure.adapter.classadapter.Source;
import indi.fuhongxue.pattern.structure.adapter.classadapter.Targetable;

/**
 * �����������ģʽ��
 * Wrapper����Source��Ķ���
 * Wrapperʵ��Ŀ��ӿ�Targetable��
 * 
 * @author 1HBLSQT
 *
 */
public class Wrapper implements Targetable {
	
	private Source source;

	public Wrapper(Source source) {
		super();
		this.source = source;
	}
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		this.source.method1();
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("This is the targetable method2 in ObjectAdapter");
	}

}
