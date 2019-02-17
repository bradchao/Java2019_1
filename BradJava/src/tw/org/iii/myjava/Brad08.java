package tw.org.iii.myjava;

public class Brad08 {
	public static void main(String[] brad) {
		int a = 10, b = 3;
		
		if (a++ > 10 && b-- > 3) {
			System.out.println("OK a=" + a + "; b = " + b);
		}else {
			System.out.println("XX a=" + a + "; b = " + b);
		}
		
		boolean c = false;
		if (c == false) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		
	}
}
