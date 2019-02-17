package tw.org.iii.myjava;

public class Brad12 {

	public static void main(String[] args) {
		int a = 0;
		for (m1();a<10;m2()) {
			System.out.println(a++);
		}
	}
	
	static void m1() {
		System.out.println("m11");
		System.out.println("m12");
	}
	
	static void m2() {
		System.out.println("m21");
		System.out.println("m22");
	}

}
