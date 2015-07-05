package net.hfutonline.pattern.factory.abstractfactory;

public interface Engine {
	public void run();

	public void start();
}

class LuxuryEngine implements Engine {
	@Override
	public void run() {
		System.out.println("luxury engine is running");
	}

	@Override
	public void start() {
		System.out.println("luxury engine is starting");
	}

}
class LowerEngine implements Engine {
	@Override
	public void run() {
		System.out.println("Lower engine is running");
	}

	@Override
	public void start() {
		System.out.println("Lower engine is starting");
	}

}