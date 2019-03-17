package tw.org.iii.myjava;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Brad76 {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(9999);
			Socket socket = server.accept();
			
			InputStream in = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(in));
			String line;
			while ( (line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			
			server.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
