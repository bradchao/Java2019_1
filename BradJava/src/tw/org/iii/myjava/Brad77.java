package tw.org.iii.myjava;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Brad77 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
					InetAddress.getByName("192.168.202.104"), 9999);
			
			BufferedWriter writer = 
					new BufferedWriter(
							new OutputStreamWriter(socket.getOutputStream()));
			writer.write("Hello, OK");
			writer.flush();
			writer.close();
			
			
			socket.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
