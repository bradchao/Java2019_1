package tw.org.iii.myjava;

import java.util.HashSet;

public class Brad37 {

	public static void main(String[] args) {
		Brad371 obj1 = new Brad371("Brad");
		Brad371 obj2 = new Brad371("Brad");
		String str1 = new String("Brad");
		//System.out.println(obj1.toString());
		//System.out.println(str1.toString());
		
		//System.out.println(obj1 == obj2);
		//System.out.println(obj1.equals(obj2));
		
		HashSet set1 = new HashSet();
		set1.add(obj1);
		set1.add(obj2);
		
	}

}
class Brad371{
	String name;
	Brad371(String name){this.name = name;}
	
	@Override
	public int hashCode() {
		System.out.println("B");
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("A");
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
