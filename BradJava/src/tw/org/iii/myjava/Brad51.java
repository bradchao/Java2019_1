package tw.org.iii.myjava;

public class Brad51 {
	public static void main(String[] args){
		Bird b1 = new Bird();
		try {
			b1.setLeg(-3);
		}catch(Exception e) {
			System.out.println("xxx");
		}
		
		Brad511 obj1 = new Brad511();
		try {
			obj1.m1();
		}catch(Exception e) {}

	}
}

class Bird {
	private int leg;
	void setLeg(int n) throws Exception{
		if (n<0) {
			throw new Exception();
		}else if (n>2) {
			throw new RuntimeException();
		}else {
			leg = n;
		}
		
	}
}

class Brad511 {
	void m1() throws Exception{
		m2();
	}
	void m2() throws Exception{
//		try {
			m3(3);
//		}catch (Exception e) {
//			
//		}
	}
	void m3(int a) throws Exception{
		if (a<0) {
			throw new Exception();
		}
	}
}


