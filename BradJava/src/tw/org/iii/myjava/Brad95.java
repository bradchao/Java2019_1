package tw.org.iii.myjava;

public class Brad95 {

	public static void main(String[] args) {
		Brad951 obj1 = new Brad951("A");
		obj1.start();
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
		}
		Brad951 obj2 = new Brad951("B");
		obj2.start();
		System.out.println("OK1");
		try {
			obj1.join(2000);
		}catch (Exception e) {
		}
		System.out.println("OK2");
	}

}
class Brad951 extends Thread {
	private String name;
	Brad951(String name){ this.name = name;}
	@Override
	public void run() {
		try {
			for (int i=0; i<10; i++) {
				System.out.println(name + ":" + i);
				Thread.sleep(500);
			}
		}catch(Exception e) {
			
		}
	}
}
