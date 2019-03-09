package tw.org.iii.myjava;

public class Brad35 {

	public static void main(String[] args) {
		Brad352 obj1 = new Brad352();
		obj1.m3();
	}

}
class Brad351{
	private byte m1() {return (byte)1;}
	void m2(byte a){}
	int m3() {return 1;}
	
	Brad353 m4() {
		return new Brad354();
	}
}
class Brad352 extends Brad351 {
	int m1(){return 1;}
	void m2(int a){}
	int m3() {
		System.out.println("m3()");
		super.m2((byte)1);
		return 1;
	}
	
	Brad354 m4() {
		return new Brad354();
	}
}

class Brad353 {
	
}

class Brad354 extends Brad353 {
	
}


