package indi.fuhongxue.pattern.construction.factory.pizza;

public abstract class AbstractPizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// ´´½¨PizzaÊµÀý
		pizza = makePizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
abstract Pizza makePizza(String type);
}
