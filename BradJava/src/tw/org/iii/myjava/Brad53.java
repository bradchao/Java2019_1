package tw.org.iii.myjava;

public class Brad53 {

	public static void main(String[] args) {
		Brad531 obj1 = null;
		try {
			obj1 = new Brad531();
		}catch(Exception e) {
			System.out.println("Exception");
		}
		obj1.m1();
		
		
	}

}
class Brad531 {
	Brad531() throws Exception {
		throw new Exception();
	}
	void m1() {
		System.out.println("Brad531:m1()");
	}
}
