package indi.fuhongxue.pattern.construction.factory.normal;

/**
 * ��ͨ����ģʽ�Ĺ�����
 * @author 1HBLSQT
 *
 */
public class Factory {
	
	public FactoryInterface produce(String type) {
		if (FactoryClass1.class.toString().equalsIgnoreCase(type)) {
			return new FactoryClass1();
		} else if (FactoryClass2.class.toString().equalsIgnoreCase(type)) {
			return new FactoryClass2();
		} else {
			System.out.println("û��Ҫ�ҵ�����");
			return null;
		}
	}
	
}
