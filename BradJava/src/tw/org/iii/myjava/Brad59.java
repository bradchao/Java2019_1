package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Brad59 {

	public static void main(String[] args) {
		File file = new File("mytest/mydata2.txt");
		if (file.exists() && file.isFile() && file.canRead()) {
			
			try {
				FileInputStream fin = new FileInputStream(file);
				
				int c; byte[] buf = new byte[3];
				while ((c = fin.read(buf)) != -1) {
					System.out.print(new String(buf, 0 , c));
				}
				
				fin.close();
				//System.out.println("OK");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
