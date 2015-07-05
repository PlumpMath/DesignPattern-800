package net.hfutonline.pattern.factory.abstractfactory;

public interface Client {
	public static void main(String[] args) {
		CarFactory factory = new LuxuryCarFactory();
		Engine e = factory.createEngine();
		e.start();
		e.run();
	}
}
