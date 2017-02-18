package indi.fuhongxue.pattern.construction.singleton;

/**
 * ��Ч�ĵ���.
 * ����Ҫ�����ܸߣ����̰߳�ȫ�ĳ���
 * ֻ�е�һ�η���ʵ����ʱ�򣬲Ż����ͬ��������ʵ��
 * @author 1HBLSQT
 *
 */

public class EffectiveSafeSingleton {
	private static EffectiveSafeSingleton uniqueInstance;
	
	private EffectiveSafeSingleton() {
	}
	
	public static synchronized EffectiveSafeSingleton getInstance() {
		// ���ʵ������������ڣ��ͽ���ͬ������
		if (null == uniqueInstance) {
			// ע�⣬ֻ�е�һ�β�ִ������Ĵ���
			synchronized (EffectiveSafeSingleton.class) {
				// ����ͬ��������ټ��һ�Ρ������Ȼ��null���Ŵ���ʵ��
				if (null == uniqueInstance) {
					uniqueInstance = new EffectiveSafeSingleton();
				}
			}
		}
		return uniqueInstance;
	}
}
