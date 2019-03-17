package tw.org.iii.myjava;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;

public class Brad83 {

	public static void main(String[] args) {
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		try {
			FileOutputStream fout = new FileOutputStream("mytest/brad2.txt");
			WritableByteChannel channel = Channels.newChannel(fout);
			
			byte[] data = {97,98,99,100};
			buffer.put(data);
			
			buffer.flip();
			channel.write(buffer);
			buffer.clear();

			buffer.put(data);
			buffer.flip();
			channel.write(buffer);
			buffer.clear();

			
			channel.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}

}
