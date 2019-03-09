package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Brad36 extends JFrame{
	private MyClock myClock;
	
	public Brad36() {
		super("OK");
		
		setLayout(new BorderLayout());
		myClock = new MyClock();
		add(myClock, BorderLayout.NORTH);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Brad36();
	}

}

class MyClock extends JPanel {
	JLabel clock;
	public MyClock() {
		setBackground(Color.yellow);
		setLayout(new FlowLayout());
		clock = new JLabel("10:20:30");
		add(clock);
		
	}
}


