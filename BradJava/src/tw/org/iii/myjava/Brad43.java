package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Brad43 extends JFrame{
	private JButton btnOk;
	private JLabel labelMessage;
	
	public Brad43() {
		
		setLayout(new BorderLayout());
		
		btnOk = new JButton("Click Me");
		add(btnOk, BorderLayout.NORTH);
		
		labelMessage = new JLabel("here");
		add(labelMessage, BorderLayout.SOUTH);
		
		btnOk.addActionListener(new MyListener(this));
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	void setLabelText(String text) {
		labelMessage.setText(text);
	}
	
	
	public static void main(String[] args) {
		new Brad43();
	}
}

class MyListener implements ActionListener {
	private Brad43 brad43;
	public MyListener(Brad43 brad43) {
		this.brad43 = brad43;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = (int)(Math.random()*49+1);
		brad43.setLabelText(""+ rand);
	}
	
}

interface Brad431 {
	void m1();
}
interface Brad432 {
	void m2();
}
interface Brad433 extends Brad431, Brad432 {
	void m1();
}
class Brad434 implements Brad433 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}