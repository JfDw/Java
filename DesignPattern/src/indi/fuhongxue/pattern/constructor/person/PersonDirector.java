package indi.fuhongxue.pattern.constructor.person;

/**
 * Director��ɫ
 * ���þ��崴���ߣ��������Ӷ���ĸ�������
 * ֻ����֤��������ֵ���������������ĳ��˳�򴴽�
 * ���漰�����Ʒ����Ϣ
 * @author 1HBLSQT
 *
 */
public class PersonDirector {
	// ע�⣺����ӿڱ�̣���Ҫ����ӿڵ�ʵ���߱��
	public Person constructPerson(PersonBuilder pb) {
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
