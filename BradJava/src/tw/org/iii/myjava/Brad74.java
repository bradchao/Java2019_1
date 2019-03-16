package tw.org.iii.myjava;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Brad74 {

	public static void main(String[] args) {
		try {
			byte[] buf = new byte[1024];
			DatagramSocket socket = new DatagramSocket();
			DatagramPacket packet = new DatagramPacket(buf, buf.length, 
					InetAddress.getByName("192.168.202.104"),8888);
			socket.send(packet);
			socket.close();
		}catch(Exception e) {
			
		}
		
	}

}
