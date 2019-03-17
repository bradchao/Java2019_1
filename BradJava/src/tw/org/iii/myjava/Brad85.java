package tw.org.iii.myjava;

import java.util.LinkedList;

public class Brad85 {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.add(0,"Brad");
		names.add(0,"Eric");
		names.set(1,"Tony");
		names.add(0,"Mary");
		names.add(0,"Brad");
		System.out.println(names.size());
		System.out.println(names.toString());
	}

}
