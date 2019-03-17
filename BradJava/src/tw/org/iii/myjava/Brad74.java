package tw.org.iii.myjava;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad74 {

	public static void main(String[] args) {
		// 192.168.202.104
		try {
			byte[] buf = "Hello, World".getBytes();
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, 
					InetAddress.getByName("192.168.202.111"),8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
