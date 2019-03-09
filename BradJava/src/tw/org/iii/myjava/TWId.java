package tw.org.iii.myjava;

public class TWId {
	private String id;
	
	public TWId() {
		this(((int)Math.random()*26));
	}
	public TWId(boolean isMale) {
		this(isMale, ((int)Math.random()*26));
	}
	
	public TWId(int area) {
		this(((int)Math.random()*2)==0?true:false , area);
	}
	
	public TWId(boolean isMale, int area) {
		
	}
	
	
	public static boolean checkId(String cid) {
		boolean ret = false;
		if (cid.matches("[A-Z][12][0-9]{8}")) {
			String letters = "ABCDEFGHJKLMNPQRSTUVXYWZIO";
			int n12 = letters.indexOf(cid.charAt(0)) + 10;
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			System.out.println(n1);
			System.out.println(n2);
		}
		
		return ret;
	}
}
