package tw.org.iii.myjava;

public class Brad11 {
	public static void main(String[] args) {
		int month = (int)(Math.random()*12+1);
		int days = 0;
		switch(month) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("A");
				days = 31;
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("B");
				days = 30;
				break;
			case 2:
				System.out.println("C");
				days = 28;
				break;
			default:
				System.out.println("D");
				days = -1;
		}
		System.out.printf("%d ¤ë¦³ %d¤Ñ", month, days);
		
		
	}
}
