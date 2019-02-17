package tw.org.iii.myjava;

public class Brad10 {
	public static void main(String[] args) {
		int a = 13;
		final int b = 11;
		// byte, short, int, char, String, enum
		switch (a) {
			default:
				System.out.println("X");
				break;
			case 1:
				System.out.println("A");
				break;
			case 10:
				System.out.println("B");
				break;
			case b - 2:
				System.out.println("C");
				break;
		}
		System.out.println("End");
	}
}
