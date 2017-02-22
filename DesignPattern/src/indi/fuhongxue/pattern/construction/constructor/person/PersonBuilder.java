package indi.fuhongxue.pattern.construction.constructor.person;

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
