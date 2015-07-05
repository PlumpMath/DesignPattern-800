package net.hfutonline.pattern.factory.simplefactory;

import net.hfutonline.pattern.factory.factorymethod.Audi;
import net.hfutonline.pattern.factory.factorymethod.Benz;
import net.hfutonline.pattern.factory.factorymethod.Car;

/**
 * 简单工厂模式，也称静态工厂模式
 * 
 * @author zlb 违反开闭原则OCP，新增车系需要修改工厂代码
 */
public class SimpleFactory {

	private SimpleFactory() {
	}

	public static Car createCar(String type) {
		if ("Audi".endsWith(type)) {
			return new Audi();
		} else if ("Benz".equals(type)) {
			return new Benz();
		}
		return null;
	}
}
