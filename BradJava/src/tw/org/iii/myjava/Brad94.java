package tw.org.iii.myjava;

import java.util.Timer;
import java.util.TimerTask;

public class Brad94 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		Brad941 obj1 = new Brad941();
		Brad942 obj2 = new Brad942(obj1);
		timer.schedule(obj1, 3*1000, 1000);
		timer.schedule(obj2,  10*1000);
	}

}
class Brad941 extends TimerTask {
	int i;
	@Override
	public void run() {
		System.out.println(i++);
	}
}
class Brad942 extends TimerTask {
	private Brad941 obj1;
	Brad942(Brad941 obj1){this.obj1=obj1;}
	@Override
	public void run() {
		obj1.cancel();
	}
}
