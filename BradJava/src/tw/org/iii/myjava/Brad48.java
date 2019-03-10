package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Brad48 extends JFrame {
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	
	public Brad48() {
		super("²q¼Æ¦r¹CÀ¸");
		
		setLayout(new BorderLayout());
		
		input = new JTextField();
		guess = new JButton("Guess");
		log = new JTextArea();
		
		
		add(log, BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess, BorderLayout.EAST);
		top.add(input, BorderLayout.CENTER);
		
		add(top, BorderLayout.NORTH);
		
		guess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				doGuess();
			}
		});
		
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void doGuess() {
		
	}
	
	
	public static void main(String[] args) {
		new Brad48();
	}

}
