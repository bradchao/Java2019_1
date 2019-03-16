package tw.org.iii.myjava;

import java.io.File;
import java.io.IOException;

public class Brad57 {

	public static void main(String[] args) {
		File file = new File("mytest/dir2/file1");
		if (!file.exists()) {
			try {
				file.createNewFile();
			}catch(IOException e) {
				System.out.println(e.toString());
			}
		}
	}

}
