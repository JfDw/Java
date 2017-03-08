package indi.fuhongxue.pattern.structure.adapter.classadapter;

/**
 * 适配器类：继承自Source类，实现Targetable接口。
 * @author 1HBLSQT
 *
 */
public class Adapter extends Source implements Targetable {

	/**
	 * 不要覆盖Source类中的method1()
	 */
//	@Override
//	public void method1() {
//		// TODO Auto-generated method stub
//
//	}

//	@Override
	public void method2() {
		System.out.println("This is the Targetable method2!");
	}

}
