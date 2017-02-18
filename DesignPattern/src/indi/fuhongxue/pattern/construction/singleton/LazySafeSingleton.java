package indi.fuhongxue.pattern.construction.singleton;

/**
 * “懒汉式”单例.
 * 线程安全
 * 在JVM加载类的时候就创建实例
 * @author 1HBLSQT
 *
 */
public class LazySafeSingleton {
	private static LazySafeSingleton uniqueInstance = new LazySafeSingleton();
	
	private LazySafeSingleton(){
	}
	
	public static LazySafeSingleton getInstance() {
		return uniqueInstance;
	}
}
