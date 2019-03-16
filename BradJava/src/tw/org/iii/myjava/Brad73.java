package tw.org.iii.myjava;

import java.net.InetAddress;

public class Brad73 {

	public static void main(String[] args) {
		try {
			InetAddress[] ips = InetAddress.getAllByName("www.microsoft.com");
			for (InetAddress ip : ips) {
				System.out.println(ip.getHostAddress());
			}
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
