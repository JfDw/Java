package indi.fuhongxue.pattern.construction.constructor.person;

/**
 * Builder½ÇÉ«
 * @author 1HBLSQT
 *
 */
public interface PersonBuilder {
	void buildHead();
	void buildBody();
	void buildFoot();
	Person buildPerson();
}
