package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Brad48 extends JFrame {
	private JTextField input;
	private JButton guess;
	private JTextArea log;
	private String answer;
	private int n = 4, counter;
	
	public Brad48() {
		super("猜數字遊戲");
		
		setLayout(new BorderLayout());
		
		input = new JTextField();
		guess = new JButton("Guess");
		log = new JTextArea();
		
		input.setFont(new Font("Default", Font.BOLD, 24));
		log.setFont(new Font("Default", Font.BOLD + Font.ITALIC, 24));
		input.setForeground(Color.red);
		
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
		
		answer = createAnswer(n);
		counter = 0;
		
		System.out.println(answer);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void doGuess() {
		counter++;
		String strInput = input.getText(); input.setText("");
		String result = checkAB(answer, strInput);
		log.append(counter + ". " + strInput + ":" + result + "\n");
		
		if (result.equals(n + "A0B")) {
			JOptionPane.showMessageDialog(null, "恭喜老爺, 賀喜夫人");
		}else if (counter == 3) {
			JOptionPane.showMessageDialog(null, "Loser: " + answer);
		}
		
	}
	
	private static String checkAB(String a, String g) {
		int A, B; A= B=0;
		
		for (int i=0; i<g.length(); i++) {
			if (g.charAt(i) == a.charAt(i)) {
				A++;
			}else if (a.indexOf(g.charAt(i))>=0) {
				B++;
			}
		}
		
		return A+"A"+B+"B";
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
