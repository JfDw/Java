package indi.fuhongxue.pattern.construction.factory.pizza;

public class BeijingPizzaStore extends AbstractPizzaStore {

	@Override
	Pizza makePizza(String type) {
		// TODO Auto-generated method stub
Pizza pizza = null;
		
		if ("cheese".equalsIgnoreCase(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equalsIgnoreCase(type)) {
			pizza = new GreekPizza();
		} else if ("pepperoni".equalsIgnoreCase(type)) {
			pizza = new PepperoniPizza();
		}
		
		return pizza;
	}

}
