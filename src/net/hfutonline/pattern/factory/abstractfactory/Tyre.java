package net.hfutonline.pattern.factory.abstractfactory;

public interface Tyre {
	public void revolve();
}

class LuxuryTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("luxury tyre revolve");
	}
	
}
class LowerTyre implements Tyre{

	@Override
	public void revolve() {
		System.out.println("lower tyre revolve");
	}
	
}