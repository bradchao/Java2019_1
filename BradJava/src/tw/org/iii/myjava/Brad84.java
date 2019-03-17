package tw.org.iii.myjava;

import java.util.TreeSet;

public class Brad84 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		while (set.size()<6) {
			set.add((int)(Math.random()*49+1));
		}
		for (Integer v : set) {
			System.out.println(v);
		}
	}

}
