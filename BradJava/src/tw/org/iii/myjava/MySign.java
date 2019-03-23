package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MySign extends JFrame{
	private JButton clear, undo, redo, saveJPEG, saveObj, loadObj;
	private MyView myView;
	
	public MySign() {
		super("簽名城市");
		
		setLayout(new BorderLayout());
	
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);top.add(undo);top.add(redo);
		
		add(top, BorderLayout.NORTH);
		
		myView = new MyView();
		add(myView, BorderLayout.CENTER);
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new MySign();
	}

}
