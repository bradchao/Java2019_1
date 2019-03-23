package tw.org.iii.myjava;

import java.util.HashSet;

public class Brad87 {

	public static void main(String[] args) {
		HashSet<MyTest> set = new HashSet<>();
		MyTest obj1 = new MyTest("A");
		MyTest obj2 = new MyTest("B");
		MyTest obj3 = new MyTest("C");
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		System.out.println(set.size());
		
	}
}

class MyTest {
	String name;
	MyTest(String name){this.name = name;}
	@Override
	public int hashCode() {
		System.out.println(name + ":hashCode()");
		return 12; //super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println(name + ":equals(" + ((MyTest)obj).name + ")");
		return true; //super.equals(obj);
	}
}
