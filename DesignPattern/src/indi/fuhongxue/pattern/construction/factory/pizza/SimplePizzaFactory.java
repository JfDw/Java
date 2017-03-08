package indi.fuhongxue.pattern.construction.factory.pizza;

public class SimplePizzaFactory implements PizzaFactory {

	public Pizza makePizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza;
		if ("Cheese".equalsIgnoreCase(type)) {
			pizza = new CheesePizza();
		} else if ("Greek".equalsIgnoreCase(type)) {
			pizza = new GreekPizza();
		} else {
			pizza = new CheesePizza();
		}
		
		return pizza;
	}

}
