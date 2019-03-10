package tw.org.iii.myjava;

public class Brad49 {

	public static void main(String[] args) {
		String s1 = new String("0");
		s1.concat("1");
		System.out.println(s1);
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.append("12345678901234567");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.append("8");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		
		
	}

}
