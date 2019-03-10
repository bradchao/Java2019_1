package tw.org.iii.myjava;

public class Brad50 {

	public static void main(String[] args) {
		
		m1();
		System.out.println("OK");
	}
	
	static void m1() {
		int a = 10, b = 3;
		int[] d = {1,2,3};
		String f = "abc";

		try {
			int c = a / b;
			System.out.println(c);
			System.out.println(d[3]);
			System.out.println(f.charAt(0));
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Ooop2");
			return;
		}catch (ArithmeticException e) {
			System.out.println("Ooop1");
		}catch (RuntimeException e) {
			System.out.println("Ooop3");
		}finally {
			System.out.println("finally");
		}
		
		System.out.println("Game over");
		
	}
	

}
