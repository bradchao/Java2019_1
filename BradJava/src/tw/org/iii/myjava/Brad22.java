package tw.org.iii.myjava;

import tw.brad.java2.test1;

public class Brad22 {

	public static void main(String[] args) {
		Brad221.m1();
		Brad221.m2();
		Brad221.m3();
		//Brad221.m4();
		System.out.println("---");
		test1.m1();
		//test1.m2();
		
		
	}

}

class Brad221 {
	public static void m1() {
		System.out.println("public");
		m4();
	}
	protected static void m2() {
		System.out.println("protected");
	}
	static void m3() {
		System.out.println("xxx");
	}
	private static void m4() {
		System.out.println("private");
	}
}
