package tw.org.iii.myjava;

import java.net.InetAddress;
import java.net.Socket;

public class Brad77 {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket(
					InetAddress.getByName("www.iii.org.tw"), 21);
			socket.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
