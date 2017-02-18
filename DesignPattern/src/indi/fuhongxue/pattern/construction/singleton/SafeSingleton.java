package indi.fuhongxue.pattern.construction.singleton;

/**
 * �̰߳�ȫ�ĵ�����
 * ���ǣ����ܲ��ߣ����getInstance()������Ƶ�����ã����ܿ��ܽ���100��
 * @author 1HBLSQT
 * 
 */
public class SafeSingleton {
	private static SafeSingleton uniqueInstance;
	
	private SafeSingleton() {
	}
	
	/**
	 * synchronized��getInstance()����
	 * ��������ʹÿ���߳��ڽ���÷���֮ǰ��Ҫ�ȵȺ����߳��뿪�������
	 * Ҳ����˵�������������߳�ͬʱ����÷���
	 */
	public static synchronized SafeSingleton getInstance() {
		if (null == uniqueInstance) {
			uniqueInstance = new SafeSingleton();
		}
		
		return uniqueInstance;
	}

}
