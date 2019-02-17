package tw.org.iii.myjava;

public class Brad18 {

	public static void main(String[] args) {
		byte[] a;
		a = new byte[3];
		int[] b = new int[2];
		int c[] = new int[4];
		//System.out.println(a[1]);
		//System.out.println(b.length);
		int d = 10;
		int[] e = new int[d];
		
		e[0] = 123;
		e[4] = 321;
		for (int i=0; i<e.length; i++) {
			System.out.println(e[i]);
		}
		System.out.println("---");
		for (int v : e) {
			System.out.println(v);
		}
		System.out.println("---");
		int[] a1 = new int[2];
		int[] a2;
		a2 = new int[] {1,2,3};
		int[] a3 = {1,2,3};
		for (int v : a3) {
			System.out.println(v);
		}
		
		
		
		
		
		
		
	}

}
