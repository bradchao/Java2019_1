package tw.org.iii.myjava;

public class PokerV1 {

	public static void main(String[] args) {
		//
		long start = System.currentTimeMillis();
		int[] poker = new int[5];
		for (int i=0; i<poker.length; i++) {
			int temp = (int)(Math.random()*5);	// 0 - 51
			
			// �ˬd����
			boolean isDup = false;
			for (int j=0; j<i; j++) {
				if (poker[j] == temp) {
					//�N���ƤF
					isDup = true;
					break;
				}
			}
			
			if (!isDup) {
				poker[i] = temp;	
				System.out.println(poker[i]);
			}else {
				i--;
			}
		}
		System.out.println("---");
		System.out.println(System.currentTimeMillis()-start);
	}

}
