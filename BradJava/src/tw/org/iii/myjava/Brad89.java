package tw.org.iii.myjava;

public class Brad89 {

	public static void main(String[] args) {
		T1 obj1 = new T1("A");
		T1 obj2 = new T1("B");
		obj1.start();
		obj2.start();
		System.out.println("main");
		
	}

}
class T1 extends Thread {
	String name;
	T1(String name){this.name = name;}
	@Override
	public void run() {
		//super.run();
		for (int i=0; i<10; i++) {
			System.out.println(name + ":" + i);
			try {
				Thread.sleep(500);
			}catch(InterruptedException ie) {
				System.out.println(ie.toString());
			}
		}
	}
}
