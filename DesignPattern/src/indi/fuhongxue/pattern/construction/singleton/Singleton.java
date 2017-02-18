package indi.fuhongxue.pattern.construction.singleton;

// 单例模式：http://www.importnew.com/23491.html

/**
 * 经典单例.
 * 但是，非线程安全
 * @author 1HBLSQT
 * 
 * */
public class Singleton {
	// 利用静态变量来保存Singleton的唯一实例
	private static Singleton uniqueInstance;
	
	// 把构造方法声明为私有的，只有Singleton类才可以调用构造方法
	private Singleton(){
	}
	
	/** 
	 * “延迟实例化”
	 * 利用getInstance()方法实例化对象，并返回这个实例
	 * getInstance()是静态的，可以在任何地方使用Singleton.getInstance()访问它
	 * @return
	 */
	public static Singleton getInstance(){
		if (null == uniqueInstance) {
			// 只有再调用getInstance()方法的时候才会创建这个实例
			// 这就是“延迟实例化”，如果我们不要这个实例，它就永远不会产生
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
