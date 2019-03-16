package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Brad64 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("mytest/coffee.jpg");
		File target = new File("mytest/dir1/coffee2.jpg");
		try {
			byte[] buf = new byte[(int)source.length()];
			FileInputStream fin = new FileInputStream(source);
			fin.read(buf);
			fin.close();
			
			FileOutputStream fout = new FileOutputStream(target);
			fout.write(buf);
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
	}

}
