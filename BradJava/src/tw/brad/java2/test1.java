package tw.brad.java2;

public class test1 {
	public test1() {
		System.out.println("111");
	}
	
	public static void m1() {
		System.out.println("111public");
		m4();
	}
	protected static void m2() {
		System.out.println("111protected");
	}
	static void m3() {
		System.out.println("111xxx");
	}
	private static void m4() {
		System.out.println("111private");
	}
	
	
}
