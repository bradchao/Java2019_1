package tw.org.iii.myjava;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Brad82 {

	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(4);
		
		try {
			FileInputStream fin = new FileInputStream("mytest/mydata.txt");
			ReadableByteChannel channel = Channels.newChannel(fin);
			
			int bytes = channel.read(buffer);
			System.out.println(bytes);
			int d0 = buffer.get(0);
			System.out.println((char)d0);
			
			buffer.flip();
			
			channel.read(buffer);
			int d1 = buffer.get(1);
			System.out.println((char)d1);
			
			channel.close();
			
			
			
			
		}catch(Exception e) {
			
		}
		
		
	}

}
