package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Brad66 {

	public static void main(String[] args) {
		File file = new File("mytest/mydata2.txt");
		if (file.exists() && file.isFile() && file.canRead()) {
			
			try {
				FileReader reader = new FileReader(file);
				int c;
				while ( (c = reader.read()) != -1 ) {
					System.out.print((char)c);
				}
				
				
				System.out.println("OK");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}

	}

}
