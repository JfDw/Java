package indi.fuhongxue.pattern.structure.proxy;

public class Proxy implements Sourceable {

	private Source source;
	
	public Proxy(){
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();
	}

	private void after() {
		// TODO Auto-generated method stub
		System.out.println("after proxy!");
	}

	private void before() {
		// TODO Auto-generated method stub
		System.out.println("before proxy!");
	}
	
	

}
