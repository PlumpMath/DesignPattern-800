package net.hfutonline.pattern.factory.factorymethod;

public class AudiCarFactory implements CarFactory {
	
	@Override
	public Car createCar() {
		return new Audi();
	}

}
