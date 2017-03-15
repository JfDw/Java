package indi.fuhongxue.pattern.structure.adapter.objectadapter;

import indi.fuhongxue.pattern.structure.adapter.classadapter.Source;
import indi.fuhongxue.pattern.structure.adapter.classadapter.Targetable;

/**
 * 对象的适配器模式。
 * Wrapper持有Source类的对象；
 * Wrapper实现目标接口Targetable。
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
