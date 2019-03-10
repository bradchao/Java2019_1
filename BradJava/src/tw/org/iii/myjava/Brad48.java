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
	private String answer;
	
	public Brad48() {
		super("猜數字遊戲");
		
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
		
		answer = createAnswer(4);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void doGuess() {
		
	}
	
	private static String createAnswer(int n) {
		int[] poker = new int[10];
		boolean isDup;
		int temp;
		for (int i=0; i<poker.length; i++) {
			do {
				temp = (int)(Math.random()*10);	// 0 - 51
				// 檢查機制
				isDup = false;
				for (int j=0; j<i; j++) {
					if (poker[j] == temp) {
						//就重複了
						isDup = true;
						break;
					}
				}
				
			}while (isDup);
			
			poker[i] = temp;	
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<n; i++) {
			sb.append(poker[i]);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		new Brad48();
	}

}
