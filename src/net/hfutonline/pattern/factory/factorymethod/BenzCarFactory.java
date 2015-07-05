package net.hfutonline.pattern.factory.factorymethod;

public class BenzCarFactory implements CarFactory {

	@Override
	public Car createCar() {
		return new Benz();
	}

}
