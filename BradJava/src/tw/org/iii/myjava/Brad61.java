package tw.org.iii.myjava;

import java.io.FileOutputStream;

public class Brad61 {

	public static void main(String[] args) {
		String data = "Hello, World\n1234567\n7654321\n大家好\n";
		try {
			FileOutputStream fout = new FileOutputStream("mytest/mydata3.txt", true);
			fout.write(data.getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		}catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
