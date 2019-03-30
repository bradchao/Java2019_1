package tw.org.iii.myjava;

public class Brad96 {

	public static void main(String[] args) {
		Brad951 obj1 = new Brad951("A");
		Brad951 obj2 = new Brad951("B");
		Brad951 obj3 = new Brad951("C");
//		obj1.setPriority(Thread.MIN_PRIORITY);
//		obj2.setPriority(Thread.NORM_PRIORITY);
//		obj3.setPriority(Thread.MAX_PRIORITY);
		obj1.setDaemon(true);
		obj1.start();//obj2.start();obj3.start();
		try {
			Thread.sleep(2000);
		}catch (Exception e) {
		}
		System.out.println("OK");
		
		
		
	}

}
