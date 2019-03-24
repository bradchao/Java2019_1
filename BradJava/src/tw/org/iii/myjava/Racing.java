package tw.org.iii.myjava;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Racing extends JFrame {
	private JLabel[] lanes = new JLabel[8];
	private Car[] cars = new Car[8];
	private JButton go;
	private int rank;
	private MyClock2 myClock;
	
	
	public Racing() {
		
		setLayout(new GridLayout(10,1));
		
		myClock = new MyClock2();
		add(myClock);
		
		go= new JButton("Go!");
		add(go);
		for (int i=0; i<8; i++) {
			lanes[i] = new JLabel();
			add(lanes[i]);
		}
		
		clearLane();
		
		go.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				go();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void clearLane() {
		rank=1;
		for (int i=0; i<8; i++) {
			lanes[i].setText((i+1) + ":");
		}
	}
	
	private void go() {
		clearLane();
		for (int i=0; i<8; i++) {
			cars[i] = new Car(i);
			cars[i].start();
		}
	}
	
	private void stopRound() {
		for (int i=0; i<8; i++) {
			cars[i].interrupt();
		}
	}
	
	private class Car extends Thread {
		int lane;
		Car(int lane){this.lane = lane;}
		@Override
		public void run() {
			for (int i=0; i<100; i++) {
				if (i==99) {
					lanes[lane].setText(lanes[lane].getText() + rank++);
					stopRound();
				}else {
					lanes[lane].setText(lanes[lane].getText() + ">");
				}
				try {
					Thread.sleep(10 + (int)(Math.random()*200));
				}catch(Exception e) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Racing();
	}

}
