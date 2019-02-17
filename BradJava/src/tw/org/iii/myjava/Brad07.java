package tw.org.iii.myjava;

public class Brad07 {

	public static void main(String[] args) {
		int year = 2018;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					// 29
				}else {
					// 28
				}
			}else {
				// 29
			}
		}else {
			// 28
		}
	}

}
