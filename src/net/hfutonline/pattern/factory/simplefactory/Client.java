package net.hfutonline.pattern.factory.simplefactory;

import net.hfutonline.pattern.factory.factorymethod.Car;

public class Client {
	public static void main(String[] args) {
		//简单工厂模式调用
		Car audi = SimpleFactory.createCar("Audi");
		audi.run();
	}
}
