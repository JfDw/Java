package indi.fuhongxue.pattern.constructor.person;

/**
 * Builder��ɫ
 * @author 1HBLSQT
 *
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();
}
