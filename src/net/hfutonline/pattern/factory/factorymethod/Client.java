package net.hfutonline.pattern.factory.factorymethod;

/**
 * 对于工厂方法模式，可以结合单例模式避免每次都要new工厂 
 * 工厂方法模式不违反OCP原则，即不修改原来的类即可达到扩展的目的，但是代码量会大幅增加
 * @author zlb
 *
 */
public class Client {
	public static void main(String[] args) {
		Car benz = new BenzCarFactory().createCar();
		benz.run();
	}
}
