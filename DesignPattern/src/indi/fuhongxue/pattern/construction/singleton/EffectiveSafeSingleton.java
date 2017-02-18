package indi.fuhongxue.pattern.construction.singleton;

/**
 * 高效的单例.
 * 适于要求性能高，且线程安全的场景
 * 只有第一次访问实例的时候，才会进行同步，创建实例
 * @author 1HBLSQT
 *
 */

public class EffectiveSafeSingleton {
	private static EffectiveSafeSingleton uniqueInstance;
	
	private EffectiveSafeSingleton() {
	}
	
	public static synchronized EffectiveSafeSingleton getInstance() {
		// 检查实例，如果不存在，就进入同步区块
		if (null == uniqueInstance) {
			// 注意，只有第一次才执行这里的代码
			synchronized (EffectiveSafeSingleton.class) {
				// 进入同步区块后，再检查一次。如果仍然是null，才创建实例
				if (null == uniqueInstance) {
					uniqueInstance = new EffectiveSafeSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
