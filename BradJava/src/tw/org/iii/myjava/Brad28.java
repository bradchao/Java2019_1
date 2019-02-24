package tw.org.iii.myjava;

public class Brad28 {

	public static void main(String[] args) {
		String s1 = new String();
		byte[] b1 = {97, 98, 99, 100};
		String s2 = new String(b1);
		System.out.println(s1);
		System.out.println(s2);
		String s3 = "Hello, World";
		System.out.println(s3);
		System.out.println("---");
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println("Brad".length());
		String s4 = s2;
		
		
	}

}
