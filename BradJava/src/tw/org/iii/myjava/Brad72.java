package tw.org.iii.myjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
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
			
			ObjectInputStream ooin = new ObjectInputStream(new FileInputStream("mytest/test1.oo"));
			IIIv3 obj1 = (IIIv3)(ooin.readObject());
			System.out.println(obj1.a + ":" + obj1.b);
			System.out.println(obj1.brad.c);
			ooin.close();
			System.out.println("OK2");
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
}
class Brad implements Serializable{
	int c = 20;
}
class IIIv1 {
	IIIv1(){
		System.out.println("v1");
	}
}
class IIIv2 extends IIIv1 implements Serializable{
	IIIv2(){
		System.out.println("v2");
	}
}
class IIIv3 extends IIIv2 {
	Brad brad;
	int a;
	transient int b;
	IIIv3(){
		brad = new Brad();
		a = 10; b = 3;
		System.out.println("v3");
	}
}
