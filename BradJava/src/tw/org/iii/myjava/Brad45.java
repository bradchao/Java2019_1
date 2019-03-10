package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Brad45 extends JFrame {
	private JButton btnOk, btn2;
	private JLabel labelMessage, label2;
	
	public Brad45() {
		
		setLayout(new BorderLayout());
		
		btnOk = new JButton("Click Me");
		add(btnOk, BorderLayout.NORTH);
		btn2= new JButton("Click 2");
		add(btn2, BorderLayout.WEST);
		
		labelMessage = new JLabel("here");
		add(labelMessage, BorderLayout.SOUTH);
		label2 = new JLabel("there");
		add(label2, BorderLayout.EAST);
		
		btnOk.addActionListener(new MyListener());
		
		
		setSize(640, 480);
		setVisible(true);
		
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new MyAdapter());
	}
	
	class MyListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			labelMessage.setText("I am Brad");
		}
	}
	
	
	
	void setLabelText(String text) {
		labelMessage.setText(text);
	}
	
	
	public static void main(String[] args) {
		new Brad45();
	}

}

