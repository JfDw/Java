package indi.fuhongxue.pattern.construction.singleton;

// ����ģʽ��http://www.importnew.com/23491.html

/**
 * ���䵥��.
 * ���ǣ����̰߳�ȫ
 * @author 1HBLSQT
 * 
 * */
public class Singleton {
	// ���þ�̬����������Singleton��Ψһʵ��
	private static Singleton uniqueInstance;
	
	// �ѹ��췽������Ϊ˽�еģ�ֻ��Singleton��ſ��Ե��ù��췽��
	private Singleton(){
	}
	
	/** 
	 * ���ӳ�ʵ������
	 * ����getInstance()����ʵ�������󣬲��������ʵ��
	 * getInstance()�Ǿ�̬�ģ��������κεط�ʹ��Singleton.getInstance()������
	 * @return
	 */
	public static Singleton getInstance(){
		if (null == uniqueInstance) {
			// ֻ���ٵ���getInstance()������ʱ��Żᴴ�����ʵ��
			// ����ǡ��ӳ�ʵ��������������ǲ�Ҫ���ʵ����������Զ�������
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}

}
