package tw.org.iii.myjava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Brad68 {

	public static void main(String[] args) {
		try {
			DataOutputStream dout = 
					new DataOutputStream(new FileOutputStream("mytest/brad.dat"));
			dout.writeByte(12);
			dout.writeBoolean(false);
			dout.writeDouble(12.3);
			dout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
