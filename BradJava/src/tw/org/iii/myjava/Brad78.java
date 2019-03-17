package tw.org.iii.myjava;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Brad78 {

	public static void main(String[] args) {
		try {
			File source = new File("mytest/coffee.jpg");
//			File source = new File("mytest/coffee2.JPG");
			BufferedInputStream bin = new BufferedInputStream(new FileInputStream(source));
			byte[] buf = new byte[4096];

			Socket socket = new Socket(
					InetAddress.getByName("192.168.202.104"), 9999);			
			OutputStream bout = socket.getOutputStream();
			
			int len;
			while ( (len = bin.read(buf)) != -1) {
				bout.write(buf,0,len);
				bout.flush();
			}
			bout.close();

			bin.close();
			socket.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
