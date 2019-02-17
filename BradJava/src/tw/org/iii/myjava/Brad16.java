package tw.org.iii.myjava;

public class Brad16 {

	public static void main(String[] args) {
		/*
		 * 1 => 1
		 * 1 + 2 => 3
		 * 3 + 3 => 6
		 * 6 + 4 = >10
		 * 1 + 2 + ... + 10 = 55
		 */
		int i, sum, n = 7652;
		i = sum = 0;
		while (i<=n) {
			sum += i++;
		}
		System.out.printf("1 + 2 + ... + %d = %d", n, sum);
	}

}
