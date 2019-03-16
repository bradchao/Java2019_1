package tw.org.iii.myjava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad72 {
	public static void main(String[] args) {
		IIIv3 obj = new IIIv3();
		System.out.println("-----");
		try {
			ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream("mytest/test1.oo"));
			oout.writeObject(obj);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Brad{
}
class IIIv1 implements Serializable{
	int a;
	int b;
	Brad brad;
	IIIv1(){
		System.out.println("v1");
	}
}
class IIIv2 extends IIIv1 {
	IIIv2(){
		System.out.println("v2");
	}
}
class IIIv3 extends IIIv2 {
	IIIv3(){
		System.out.println("v3");
	}
}
