package tw.org.iii.myjava;

public class Brad97 {
	private static final int STOP = 0;
	private static final int UP = 1;
	private static final int DOWN = 2;
	private static final int LEFT = 3;
	private static final int RIGHT = 4;
	
	public static void main(String[] args) {
		int dir = STOP;
		dir = LEFT;
		dir = 7;
		
		Dir mydir = Dir.STOP;
		mydir = Dir.RIGHT;
		System.out.println(mydir.toString());
		System.out.println(mydir.name());
		System.out.println(mydir.getV());
		
		//Dir dir1 = new Dir();
		// byte, short, char, int, String, enum
		switch(mydir) {
			case UP: System.out.println("go up"); break;
			case DOWN: System.out.println("go down"); break;
			case LEFT: System.out.println("go left"); break;
			case RIGHT: System.out.println("go right"); break;
		}
		
		
	}

}
enum Dir {
	UP(1), DOWN(2), LEFT(3), RIGHT(4), STOP(0);
	private int v;
	Dir(){		// private
		//super();
//		System.out.println("OK");
	}
	Dir(int a){
		v = a;
//		System.out.println("OK1");
	}

	int getV() {return v;}
}
// no extends 
//enum Dir2 extends Dir {
//	
//}