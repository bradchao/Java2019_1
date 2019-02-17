package tw.org.iii.myjava;

import java.util.Collections;
import java.util.LinkedList;

public class PokerV3 {

	public static void main(String[] args) {
		//
		long start = System.currentTimeMillis();
		LinkedList<Integer> poker = new LinkedList<Integer>();
		for (int i=0; i<6; i++) poker.add(i);
		Collections.shuffle(poker);
		for (Integer card: poker) {
			System.out.println(card);
		}
		
		
		System.out.println("---");
		System.out.println(System.currentTimeMillis()-start);
	}

}
