package tw.org.iii.myjava;

public class Brad29 {

	public static void main(String[] args) {
		String s1 = new String("Brad");
		String s2 = new String("Brad");
		System.out.println(s1 == s2);
		String s3 = "Brad";
		String s4 = "Brad";
		System.out.println(s3 == s4);
		String s5 = s1;
		System.out.println(s1 == s5);
		s1 = s1 + "OK";
		System.out.println(s1 == s5);
		
	}

}
