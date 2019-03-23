package tw.org.iii.myjava;

public class Brad88 {

	public static void main(String[] args) {
		// Wrapper Class
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("10");
		Integer i3 = 127;	// auto-boxing
		Integer i7 = 127;	// auto-boxing
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		int i4 = i1 + i2;	// unboxing
		System.out.println(i4);
		byte b1 = 12;
		int i5 = b1;
		//Integer i6 = b1;	// 1. auto-cast 2. auto-boxing
		
		System.out.println(i1 == i2);
		System.out.println(i1 == i7);
		System.out.println(i3 == i7);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i7));
		System.out.println(i3.equals(i7));
		
	}

}
