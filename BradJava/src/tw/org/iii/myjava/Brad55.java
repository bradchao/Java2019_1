package tw.org.iii.myjava;

import java.io.File;

public class Brad55 {

	public static void main(String[] args) {
		File file = new File("c:/brad/test1");
		if (file.exists()) {
			System.out.println("exist");
		}else {
			System.out.println("not exist");
		}
	}

}
