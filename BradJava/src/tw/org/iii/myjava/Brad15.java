package tw.org.iii.myjava;

public class Brad15 {

	public static void main(String[] args) {
		for (int i=0; i<10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
			if ( i == 7) {
				break;
			}
		}
	}

}
