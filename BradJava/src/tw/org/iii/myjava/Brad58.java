package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Brad58 {

	public static void main(String[] args) {
		File file = new File("mytest/mydata.txt");
		if (file.exists() && file.isFile() && file.canRead()) {
			
			try {
				FileInputStream fin = new FileInputStream(file);
				
				int c;
				while ((c = fin.read()) != -1) {
					System.out.print((char)c);
				}
				
				fin.close();
				//System.out.println("OK");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
