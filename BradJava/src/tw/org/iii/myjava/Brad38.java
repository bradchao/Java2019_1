package tw.org.iii.myjava;

public class Brad38 {

	public static void main(String[] args) {
		Brad381 obj1 = new Brad382();
		Brad381 obj2 = new Brad383();
		
		m1(obj1);
		m1(obj2);
	}
	
	static void m1(Brad381 obj) {
		obj.m1();
	}

}
abstract class Brad381 {
	Brad381(){
		System.out.println("I am Brad381");
	}
	abstract void m1();
	void m2() {}
}
class Brad382 extends Brad381 {
	void m1() {System.out.println("A");}
}
class Brad383 extends Brad381 {
	void m1() {System.out.println("B");}
}
