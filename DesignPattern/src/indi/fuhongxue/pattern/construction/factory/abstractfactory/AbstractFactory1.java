package indi.fuhongxue.pattern.construction.factory.abstractfactory;

import indi.fuhongxue.pattern.construction.factory.normal.FactoryClass1;
import indi.fuhongxue.pattern.construction.factory.normal.FactoryInterface;

public class AbstractFactory1 implements AbstractFactoryProvider {
	@Override
	public FactoryInterface produce() {
		return new FactoryClass1();
	}
}
