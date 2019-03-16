package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.filechooser.FileNameExtensionFilter;

public class Brad60 {

	public static void main(String[] args) {
		File file = new File("mytest/mydata2.txt");
		if (file.exists() && file.isFile() && file.canRead()) {
			
			try {
				FileInputStream fin = new FileInputStream(file);
				
				byte[] buf = new byte[(int)file.length()];
				fin.read(buf);
				System.out.println(new String(buf));
				
				fin.close();
				//System.out.println("OK");
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
	}

}
