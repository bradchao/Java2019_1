package tw.org.iii.myjava;

import tw.brad.java2.BikeV2;

public class Brad24 {

	public static void main(String[] args) {
		Brad243 obj1 = new Brad243(3);
	}

}

class Brad241 {
	Brad241(){
		System.out.println("Brad241()");
	}
	Brad241(int a){
		// super()
		System.out.println("Brad241(int)");
	}
}
class Brad242 extends Brad241 {
	Brad242(){
		super(2);
		System.out.println("Brad242()");
	}
}
class Brad243 extends Brad242 {
	Brad243(){
		System.out.println("Brad243()");
	}
	Brad243(int a){
		this();
		System.out.println("Brad243(int)");
	}
	Brad243(double b){
		this();
		System.out.println("Brad243(double)");
	}
}
