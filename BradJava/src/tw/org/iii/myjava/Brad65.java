package tw.org.iii.myjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Brad65 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		File source = new File("mytest/coffee.jpg");
		try(FileInputStream fin = new FileInputStream(source);
				FileOutputStream fout = new FileOutputStream(source)) {
			
			System.out.println("OK");
//		}catch(SecurityException e) {
//			System.out.println(e.toString());
		}catch(FileNotFoundException | SecurityException e) {
			System.out.println(e.toString());
		}catch(IOException e) {
			System.out.println(e.toString());
		}
		System.out.println(System.currentTimeMillis()-start);
	}
	
	static void cpdir(File source, File target) throws Exception {
		
	}
	

}
