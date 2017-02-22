package indi.fuhongxue.pattern.construction.factory.abstractfactory;

import indi.fuhongxue.pattern.construction.factory.normal.FactoryClass2;
import indi.fuhongxue.pattern.construction.factory.normal.FactoryInterface;

public class AbstractFactory2 implements AbstractFactoryProvider {

	@Override
	public FactoryInterface produce() {
		// TODO Auto-generated method stub
		return new FactoryClass2();
	}

}
