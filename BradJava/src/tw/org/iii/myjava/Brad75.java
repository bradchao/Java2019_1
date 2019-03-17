package tw.org.iii.myjava;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Brad75 {

	public static void main(String[] args) {
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = new DatagramSocket(8888);
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			socket.receive(packet);
			socket.close();
			
			String urip = packet.getAddress().getHostAddress();
			int len = packet.getLength();
			byte[] data = packet.getData();
			
			System.out.println("ip:" + urip);
			System.out.println("len:" + len);
			System.out.println("data len:" + data.length);
			System.out.println("buf:" + new String(buf,0,len));
			System.out.println("data:" + new String(data));
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
