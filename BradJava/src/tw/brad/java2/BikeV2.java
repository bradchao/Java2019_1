package tw.brad.java2;

public class BikeV2 extends Bike {
	public void upSpeed(int gear) {
		if (gear >=0) {
			speed = speed<1 ? 1 : speed*(1.2+gear);
		}
	}
}
