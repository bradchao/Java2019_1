package tw.org.iii.myjava;

public class Brad41 {

	public static void main(String[] args) {
		Brad411 obj1 = new Brad411();
		Brad411 obj2 = new Brad411();
	}

}
class Brad411 {
	{
		System.out.println("{}");
		m1();
	}
	static {
		System.out.println("static{}");
	}
	Brad411(){System.out.println("Brad411()");}
	void m1() {
		System.out.println("m1()");
	}
	static void m2() {
		System.out.println("m2()");
	}
}

interface Brad412 {
	final double var1 = 123;
	void m1();
}

