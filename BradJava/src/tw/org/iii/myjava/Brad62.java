package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad62 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("mytest/coffee.jpg");
		File target = new File("mytest/dir1/coffee.jpg");
		try {
			FileInputStream fin = new FileInputStream(source);
			FileOutputStream fout = new FileOutputStream(target);
			int b;
			while ( (b = fin.read()) !=-1) {
				fout.write(b);
			}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis() - start);
	}

}
