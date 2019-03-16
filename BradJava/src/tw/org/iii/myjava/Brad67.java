package tw.org.iii.myjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Brad67 {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("mytest/mydata2.txt")));
			String line;
			while ( (line = br.readLine()) != null) {
				System.out.print(line + "\n");
			}
			
			br.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
