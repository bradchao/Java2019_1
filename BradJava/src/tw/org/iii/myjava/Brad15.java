package tw.org.iii.myjava;

public class Brad15 {

	public static void main(String[] args) {
		
		brad: for(int j=10; j>0; j--) {
			for (int i=0; i<10; i++) {
				if (i % 2 == 0) {
					continue;
				}
				System.out.println(i + ":" + j);
				if ( i == 7 && j == 6) {
					break brad;
				}
			}
		}
	}

}
