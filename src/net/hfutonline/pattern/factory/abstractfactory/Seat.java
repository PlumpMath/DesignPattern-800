package net.hfutonline.pattern.factory.abstractfactory;

public interface Seat {
	public void massage();
}

class LuxurySeat implements Seat{

	@Override
	public void massage() {
		System.out.println("luxury seat massage");
	}
	
}
class LowerSeat implements Seat{

	@Override
	public void massage() {
		System.out.println("lower seat massage");
	}
	
}