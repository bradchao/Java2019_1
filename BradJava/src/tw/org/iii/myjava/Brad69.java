package tw.org.iii.myjava;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Brad69 {

	public static void main(String[] args) {
		try {
			DataInputStream din = 
					new DataInputStream(new FileInputStream("mytest/brad.dat"));
			byte d1 = din.readByte();
			boolean d2  = din.readBoolean();
			double d3  = din.readDouble();
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d3);
			din.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
