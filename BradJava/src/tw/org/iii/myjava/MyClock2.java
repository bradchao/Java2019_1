package tw.org.iii.myjava;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;

public class MyClock2 extends JLabel{
	private Timer timer;
	public MyClock2() {
		timer = new Timer();
		timer.schedule(new MyTimer(), 0, 1000);
	}
	
	private class MyTimer extends TimerTask {
		public void run() {
			Calendar cal = Calendar.getInstance();
			int hh = cal.get(Calendar.HOUR_OF_DAY);
			int mm = cal.get(Calendar.MINUTE);
			int ss = cal.get(Calendar.SECOND);
			
			setText(hh + ":" + mm + ":" + ss);
		}
	}
}
