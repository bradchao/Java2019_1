package tw.org.iii.myjava;

public class Brad06 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int score = (int)(Math.random()*101);
		System.out.println(score);
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
			System.out.println("B");
			score = 59;
		}else if (score >= 70) {
			System.out.println("C");
		}else if (score >= 60) {
			System.out.println("D");
		}else {
			System.out.println("E");
		}
		System.out.println("----");
		System.out.println(score);
		System.out.println(System.currentTimeMillis()- start);
		
	}

}
