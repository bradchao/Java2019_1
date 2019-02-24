package tw.org.iii.myjava;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Brad27 extends JFrame {
	private JButton btnOk, btnExit;
	
	public Brad27() {
		super("°¸ªºµøµ¡«°¥«");
		
		btnOk = new JButton("Click Me");
		btnExit = new JButton("Exit");
		
		setLayout(new FlowLayout());
		
		add(btnOk);
		add(btnExit);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Brad27();
	}

}
