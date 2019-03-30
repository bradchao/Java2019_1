package tw.org.iii.myjava;

public class GCTest {
	public static void main(String[] args) {
		// memory
		// GC
		int a = 10;
		String b = "Brad";
		b = null;
		String c;
		String d = null;
		System.out.println(d);
		
		System.gc();
		Runtime.getRuntime().gc();
		
	}
}
