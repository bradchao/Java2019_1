package tw.org.iii.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Brad80 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://pdfmyurl.com/index.php?url=http://www.bradchao.com");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
//			BufferedReader reader = new BufferedReader(
//					new InputStreamReader(conn.getInputStream()));
//			String line;
//			while ( (line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//			reader.close();

			FileOutputStream fout = new FileOutputStream("mytest/upload/coffee.pdf");
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());

			int len; byte[] buf = new byte[4096];
			while ((len = bin.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}
			fout.flush();
			fout.close();
			bin.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
