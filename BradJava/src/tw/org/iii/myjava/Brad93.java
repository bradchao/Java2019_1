package tw.org.iii.myjava;

public class Brad93 {

	public static void main(String[] args) {
		Brad931 obj1 = new Brad931();
		Brad932 obj2 = new Brad932();
		Thread obj3 = new Thread(obj2);
		obj1.start();
		obj3.start();
		System.out.println("OK");
		try {
			Thread.sleep(500);
			obj1.interrupt();
		}catch(Exception e) {
			
		}
	}

}

class Brad931 extends Thread {
	@Override
	public void run() {
		//super.run();
		for (int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("interrupt");
				break;
			}
		}
	}
}

class Brad932 implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("interrupt");
				break;
			}
		}
	}
}
