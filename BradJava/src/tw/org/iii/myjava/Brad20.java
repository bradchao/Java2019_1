package tw.org.iii.myjava;

public class Brad20 {
	public static void main(String[] args) {
		int[][] a;
		a = new int[2][];
		a[0] = new int[3];
		a[1] = new int[4];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[1][3] = 7;
		System.out.println(a.length);
		System.out.println(a[1].length);
		System.out.println("---");
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---");
		for (int[] e : a) {
			for (int v: e) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
		
		
		
	
	}
}
