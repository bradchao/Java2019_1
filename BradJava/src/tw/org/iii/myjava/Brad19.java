package tw.org.iii.myjava;

public class Brad19 {

	public static void main(String[] args) {
		int[] p = new int[7];	// 0-6
		for (int i=0; i<100000; i++) {
			int point = (int)(Math.random()*9+1);
			p[point>=7?point-3:point]++;
		}
		for (int i=1; i<p.length; i++) {
			System.out.printf("%d ¥X²{ %d ¦¸\n", i, p[i]);
		}
		if (p[0]>0) {
			System.out.println("bug");
		}
	}

}
