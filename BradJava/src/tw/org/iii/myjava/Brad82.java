package tw.org.iii.myjava;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Brad82 {

	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(8);
		
		try {
			FileInputStream fin = new FileInputStream("");
			ReadableByteChannel channel = Channels.newChannel(fin);
			
			
			
			
			
		}catch(Exception e) {
			
		}
		
		
	}

}
