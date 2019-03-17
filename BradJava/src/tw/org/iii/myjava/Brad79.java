package tw.org.iii.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Brad79 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();

			byte[] buf = new byte[4096];
			InputStream in = socket.getInputStream();
			
			FileOutputStream fout = new FileOutputStream("mytest/upload/coffee.jpg");
			BufferedInputStream bin = new BufferedInputStream(in);

			int len;
			if (bin.available()>0) {
				while ((len = bin.read(buf)) != -1) {
					System.out.println("len = "+ len);
					fout.write(buf, 0, len);
				}
				fout.flush();
				fout.close();
				bin.close();
			}else {
				System.out.println("no data");
			}
			
			server.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
