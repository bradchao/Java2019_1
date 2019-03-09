package tw.org.iii.myjava;

public class Brad33 {

	public static void main(String[] args) {
		Brad331 obj1 = new Brad331();
		obj1.m1();
		//obj1.m1(1);
		//obj1.m1(1f);
		//obj1.m1(1.2);
		//obj1.m1((byte)1,(byte)1);
		
		obj1.m1(1,2,3);
		obj1.m1(new int[] {1,2,3});
	}

}
// Overload => ÂÐ¸ü
// same class
class Brad331 {
	int m1() {System.out.println("()"); return 1;}
	//void m1(int a) {System.out.println("(int)");}
	//void m1(float a){System.out.println("(float)");}
	//void m1(double a){System.out.println("(double)");}
	void m1(int a, byte b){System.out.println("(int,byte)");}
//	void m1(byte a, byte b){System.out.println("(byte,byte)");}
	void m1(int a, int b){System.out.println("(int,int)");}
	void m1(byte a, int b){System.out.println("(int,int)");}
	
	void m1(int... a) {
		for (int v: a) {System.out.println(v);}
	}
//	void m1(int[] a) {
//		for (int v: a) {System.out.println(v);}
//	}
	
	
}
