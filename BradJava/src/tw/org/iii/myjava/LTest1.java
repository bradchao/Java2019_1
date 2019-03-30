package tw.org.iii.myjava;

public class LTest1 {

	public static void main(String[] args) {
		LTest11 obj1 = new LTest11() {
			public void m1() {
				System.out.println("m1()");
			}
			public void m2() {
				System.out.println("m2()");
			}
		};
		test1(obj1);
		test1(new LTest11() {
			@Override
			public void m1() {
				System.out.println("m1()2");
			}
			@Override
			public void m2() {
				System.out.println("m2()2");
			}
		});
		
		test2(new LTest12() {void m1(){System.out.println("new m1()");}});
		
		test3((x,y)->{System.out.println("m3()" + (x + y));});
		
		LTest5 obj2 = new LTest5();
		obj2.m1();
		obj2.m2();
		obj2.m3();
		
	}

	static void test1(LTest11 obj) {
		obj.m1();
		obj.m2();
	}
	
	static void test2(LTest12 obj) {
		obj.m1();
	}
	
	static void test3(LTest13 obj) {
		obj.m3(3,4);
	}
	
}
interface LTest11 {
	void m1();
	void m2();
}
class LTest12 {
	void m1() {
		System.out.println("LTest12:m1()");
	}
}
interface LTest13 {
	void m3(int a, int b);
}

interface LTest4 {
	void m1();
	default void m2() {
		System.out.println("m2()");
	};
	default void m3() {
		System.out.println("m3()");
	};
}
class LTest5 implements LTest4 {
	public void m1() {
		System.out.println("m1()");
	}
}

