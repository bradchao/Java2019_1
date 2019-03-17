package tw.org.iii.myjava;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Brad75 {

	public static void main(String[] args) {
		while (true) {
			byte[] buf = new byte[1024];
			try {
				DatagramSocket socket = new DatagramSocket(8888);
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				socket.close();
				
				String urip = packet.getAddress().getHostAddress();
				int len = packet.getLength();
				byte[] data = packet.getData();
				String response = new String(data,0,len);
				System.out.println("ip:" + urip + "; " + response);
				
				if (response.equals("quit")) {
					break;
				}
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println("Server Down");
	}

}
