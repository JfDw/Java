package indi.fuhongxue.pattern.structure.decorator;

public class Decorator implements Sourceable {

	private Sourceable source;
	
	public Decorator(Sourceable source) 
	{
		super(); // TODO super()??
		this.source = source;
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Before decorator!");
		source.method();
		System.out.println("After decorator!");
	}
}
