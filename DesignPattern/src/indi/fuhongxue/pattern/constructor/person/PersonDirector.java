package indi.fuhongxue.pattern.constructor.person;

/**
 * Director角色
 * 调用具体创建者，创建复杂对象的各个部分
 * 只负责保证对象各部分的完整创建，或按照某种顺序创建
 * 不涉及具体产品的信息
 * @author 1HBLSQT
 *
 */
public class PersonDirector {
	// 注意：面向接口编程，不要面向接口的实现者编程
	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
