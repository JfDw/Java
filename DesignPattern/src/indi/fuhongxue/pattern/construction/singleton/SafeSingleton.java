package indi.fuhongxue.pattern.construction.singleton;

/**
 * 线程安全的单例类
 * 但是，性能不高，如果getInstance()方法被频繁调用，性能可能降低100倍
 * @author 1HBLSQT
 * 
 */
public class SafeSingleton {
	private static SafeSingleton uniqueInstance;
	
	private SafeSingleton() {
	}
	
	/**
	 * synchronized的getInstance()方法
	 * 这样就迫使每个线程在进入该方法之前，要先等候别的线程离开这个方法
	 * 也就是说，不会有两个线程同时进入该方法
	 */
	public static synchronized SafeSingleton getInstance() {
		if (null == uniqueInstance) {
			uniqueInstance = new SafeSingleton();
		}
		
		return uniqueInstance;
	}

}
