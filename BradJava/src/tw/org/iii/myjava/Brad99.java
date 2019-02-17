package tw.org.iii.myjava;

public class Brad99 {

	public static void main(String[] args) {
		for (int j=1; j<=9; j=newLine(j)) {
			for (int i=2; i<=5; i++) {
				int result = i * j;
				System.out.printf("%d x %d = %d\t", i, j, result);
			}
		}
	}

	static int newLine(int jj) {
		System.out.println();
		return jj + 1;
	}
}
