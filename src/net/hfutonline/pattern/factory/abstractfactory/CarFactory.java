package net.hfutonline.pattern.factory.abstractfactory;

public interface CarFactory {
	public Engine createEngine();
	public Seat createSeat();
	public Tyre createTyre();
}
