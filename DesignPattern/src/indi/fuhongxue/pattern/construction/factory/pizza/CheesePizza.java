package indi.fuhongxue.pattern.construction.factory.pizza;

public class CheesePizza implements Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Prepare Cheese");
	}

	@Override
	public void bake() {
		// TODO Auto-generated method stub

		System.out.println("Bake Cheese");
	}

	@Override
	public void cut() {
		// TODO Auto-generated method stub

		System.out.println("Cut Cheese");
	}

	@Override
	public void box() {
		// TODO Auto-generated method stub

		System.out.println("Box Cheese");
	}

}
