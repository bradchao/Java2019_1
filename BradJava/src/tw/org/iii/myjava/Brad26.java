package tw.org.iii.myjava;

import javax.swing.JFrame;

public class Brad26 {
	public static void main(String[] args) {
		MyWindow obj1 = new MyWindow();
	}
}

class MyWindow extends JFrame{
	
	public MyWindow() {
		super("������������");
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
