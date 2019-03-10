package tw.org.iii.myjava;

public class Brad44 {

	public static void main(String[] args) {
		Brad441 obj1 = new Brad441();
		obj1.m1();
		obj1.m1();
		System.out.println(obj1.a);
		
		Brad441.Brad442 obj2 = obj1.new Brad442();
		obj2.m2();
		obj2.m2();
		System.out.println(obj1.a);
		
	}

}

class Brad441{
	int a = 10;
	//private Brad441() {}
	void m1() {
		a++;
//		Brad442 obj = new Brad442();
//		obj.m2();
	}
	class Brad442 {
		void m2() {
			a--;
		}
	}
}
