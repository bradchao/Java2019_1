package tw.org.iii.myjava;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Brad71 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new FileInputStream("mytest/brad.object"));
			Object obj;
			while (true) {
				try {
					obj = oin.readObject();
					if (obj instanceof Student) {
						System.out.println("Avg:" + ((Student)obj).calAvg());
					}else if (obj instanceof String) {
						System.out.println(obj.toString());
					}
				}catch(EOFException e) {
					break;
				}
			}
			
			oin.close();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
