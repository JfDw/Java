package indi.fuhongxue.pattern.constructor.person;

/**
 * ConcreteBuilder角色
 * 实现Builder接口
 * @author 1HBLSQT
 *
 */
public class ManBuilder implements PersonBuilder {

	Person person;
	public ManBuilder() {
		person = new Person();
	}
	
	public void buildBody() {
		person.setBody("建造男人的身体");
	}
	
	public void buildHead() {
		person.setHead("建造男人的头");
	}
	
	public void buildFoot() {
		person.setFoot("建造男人的脚");
	}
	
	public Person buildPerson() {
		return person;
	}
}
