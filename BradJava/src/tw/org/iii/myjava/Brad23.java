package tw.org.iii.myjava;

import tw.brad.java2.Bike;
import tw.brad.java2.BikeV2;

public class Brad23 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.upSpeed();
		b1.upSpeed();
		System.out.println(b1.getSpeed());
		
		BikeV2 b2 = new BikeV2();
		b2.chGear(2);
		b2.upSpeed();
		b2.upSpeed();
		System.out.println(b2.getSpeed());
		b2.downSpeed();
		System.out.println(b2.getSpeed());
		
	}

}
