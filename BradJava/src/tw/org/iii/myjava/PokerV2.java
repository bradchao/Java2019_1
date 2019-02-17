package tw.org.iii.myjava;

public class PokerV2 {

	public static void main(String[] args) {
		int[] poker = new int[52];
		boolean isDup;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
				temp = (int)(Math.random()*52);	// 0 - 51
				// 檢查機制
				isDup = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == temp) {
						//就重複了
						isDup = true;
						break;
					}
				}
				
			}while (isDup);
			
			poker[i] = temp;	
			System.out.println(poker[i]);
		}
		System.out.println("---");
		
		int[][] players = new int[4][13];
		for(int i=0; i<poker.length; i++) {
			players[i%4][i/4] = poker[i];
		}
		
		for (int card : players[1]) {
			System.out.print(card + " ");
		}
		
		
		
		
		
		
		
		
	}

}
