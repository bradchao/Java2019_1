package tw.brad.java2;

public class BikeV2 extends Bike {
	private int gear;
	public void chGear(int g) {
		if (g>=0) {
			gear = g;
		}
	}
	public void upSpeed() {
		speed = speed<1 ? 1 : speed*(1.2+gear);
	}
}
