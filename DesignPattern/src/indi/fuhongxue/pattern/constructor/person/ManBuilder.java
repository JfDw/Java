package indi.fuhongxue.pattern.constructor.person;

/**
 * ConcreteBuilder��ɫ
 * ʵ��Builder�ӿ�
 * @author 1HBLSQT
 *
 */
public class ManBuilder implements PersonBuilder {

	Person person;
	public ManBuilder() {
		person = new Person();
	}
	
	public void buildBody() {
		person.setBody("�������˵�����");
	}
	
	public void buildHead() {
		person.setHead("�������˵�ͷ");
	}
	
	public void buildFoot() {
		person.setFoot("�������˵Ľ�");
	}
	
	public Person buildPerson() {
		return person;
	}
}
