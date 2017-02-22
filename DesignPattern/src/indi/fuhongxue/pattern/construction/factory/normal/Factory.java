package indi.fuhongxue.pattern.construction.factory.normal;

/**
 * 普通工厂模式的工厂类
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
			System.out.println("没有要找的类型");
			return null;
		}
	}
	
	public FactoryInterface produceOne() {
		return new FactoryClass1();
	}
	
	public FactoryInterface produceTwo() {
		return new FactoryClass2();
	}
	
	public static FactoryInterface staticProduceOne() {
		return new FactoryClass1();
	}
	
	public static FactoryInterface staticProduceTwo() {
		return new FactoryClass2();
	}

}
