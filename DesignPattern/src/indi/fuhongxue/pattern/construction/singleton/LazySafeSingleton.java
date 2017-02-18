package indi.fuhongxue.pattern.construction.singleton;

/**
 * ������ʽ������.
 * �̰߳�ȫ
 * ��JVM�������ʱ��ʹ���ʵ��
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
