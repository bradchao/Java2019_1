package tw.org.iii.myjava;

public class Brad99 {

	public static void main(String[] args) {
		for (int k=0; k<4; k=newLine(k)) {
			for (int j=1; j<=9; j=newLine(j)) {
				for (int i=2; i<=5; i++) {
					int newi = i + k * 4;
					int result = newi * j;
					System.out.printf("%d x %d = %d\t", newi, j, result);
				}
			}
		}
	}

	static int newLine(int jj) {
		System.out.println();
		return jj + 1;
	}
}
