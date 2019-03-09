package tw.org.iii.myjava;

public class Brad34 {

	public static void main(String[] args) {
		Brad341 obj1 = new Brad341();
		Brad342 obj2 = new Brad342();
		Brad341 obj3 = new Brad342();
		Brad343 obj4 = new Brad343();
		m1();
		m1(obj1);
		m1(obj2);
		m1(obj3);
		m1(obj4);
	}
	
	static void m1() {System.out.println("()");}
	static void m1(Brad341 a) {System.out.println("(Brad341)");}
	//static void m1(Brad342 a) {System.out.println("(Brad342)");}

}
class Brad341 {
	
}
class Brad342 extends Brad341 {
	
}
class Brad343 extends Brad342 {
	
}
