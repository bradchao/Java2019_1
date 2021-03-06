package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad63 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("mytest/coffee.jpg");
		File target = new File("mytest/dir1/coffee1.jpg");
		try {
			FileInputStream fin = new FileInputStream(source);
			FileOutputStream fout = new FileOutputStream(target);
			int b; byte[] buf = new byte[4096];
			while ( (b = fin.read(buf)) !=-1) {
				fout.write(buf,0,b);
			}
			fout.flush();
			fout.close();
			fin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}
