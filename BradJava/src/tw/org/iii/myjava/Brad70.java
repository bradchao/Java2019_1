package tw.org.iii.myjava;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Brad70 {

	public static void main(String[] args) {
		Student s1 = new Student(80, 40, 90);
		Student s2 = new Student(85, 43, 97);
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream(
							new FileOutputStream("mytest/brad.object"));
			oout.writeObject(s1);
			oout.writeObject("Hello, Brad");
			oout.writeObject(s2);
			oout.flush();
			oout.close();
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
class Student implements Serializable {
	int ch, eng, math;
	Student(int c, int e, int m){
		ch = c; eng = e; math = m;
	}
	double calSum() {
		return ch + eng + math;
	}
	double calAvg() {
		return calSum()/3.0;
	}
}
