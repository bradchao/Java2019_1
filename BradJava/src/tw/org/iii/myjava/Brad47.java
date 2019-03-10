package tw.org.iii.myjava;

public class Brad47 {
	public static void main(String[] args) {
		//Brad471 obj1 = new Brad471();
		//Brad471.Brad472 obj2 = obj1.new Brad472();
		Brad471.Brad473 obj3 = new Brad471.Brad473();	
		Brad471 obj4 = obj3.m1();
		
		Brad471 obj5 = Brad471.Brad473.m2();
		
		
		
	}
}
class Brad471 {
	private int a = 10;
	private static int b;
	
	private Brad471() {}
	private Brad471(int a, String b) {}
	
	void m1() {
		
	}
	class Brad472 {
		Brad471 m1() {
			return Brad471.this;
		}
	}
	
	static int m2() {
		return b;
	}
	static class Brad473 {
		Brad471 m1() {
			Brad471 obj1 = new Brad471(1, "a");
			return obj1;
		}
		static Brad471 m2() {
			Brad471 obj1 = new Brad471(1, "a");
			return obj1;
		}
	}
}
