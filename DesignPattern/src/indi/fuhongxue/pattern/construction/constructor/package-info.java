/**
 * 建造者模式
 * 将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示 
 */
/**
 * @author 1HBLSQT
 * 创建者模式包括以下角色：
 * (1) Builder：抽象接口，规定要实现复杂对象的哪部分的创建，并不涉及具体的对象部件的创建
 * (2) ConcreteBuilder：实现Builder接口，针对不同的业务逻辑，具体化复杂对象的各部分创建
 * (3) Director: 调用具体创建者来创建复杂对象的各个部分，不涉及具体产品的信息，只复杂保证对象各部分完整创建或按某种顺序创建
 * (4) Product: 要创建的复杂对象
 */
package indi.fuhongxue.pattern.construction.constructor;