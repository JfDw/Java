package indi.fuhongxue.pattern.construction.factory.pizza;

public class PizzaStore {

	PizzaFactory pizzaFactory;
	
	public PizzaStore(PizzaFactory pizzaFactory) {
		// TODO Auto-generated constructor stub
		this.pizzaFactory = pizzaFactory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = pizzaFactory.makePizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
