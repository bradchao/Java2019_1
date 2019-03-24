package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyGame extends JFrame{
	private GamePanel gp;
	public MyGame() {
		
		setLayout(new BorderLayout());
		gp = new GamePanel();
		add(gp, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class GamePanel extends JPanel{
		private BufferedImage ball;
		private Timer timer;
		private BallTask ballTask;
		private int viewW, viewH, ballW, ballH;
		
		GamePanel(){
			timer = new Timer();
			setBackground(Color.YELLOW);
			try {
				ball = ImageIO.read(new File("mytest/ball.png"));
				ballW = ball.getWidth(); ballH = ball.getHeight();
				ballTask = new BallTask(100,100);
				timer.schedule(new MyResfresh(), 0, 12);
				timer.schedule(ballTask, 1*1000, 30);
				
				
			}catch(Exception e) {
				
			}
			
		}
		
		private class MyResfresh extends TimerTask {
			@Override
			public void run() {
				repaint();
			}
		}
		
		private class BallTask extends TimerTask {
			int x, y, dx, dy;
			BallTask(int x, int y){
				this.x = x; this.y = y;
				dx = dy = 4;
			}
			public void run() {
				if (x<0 || x + ballW > viewW) {
					dx *= -1;
				}
				if (y<0 || y+ballH > viewH) {
					dy *= -1;
				}
				x += dx; y += dy;
			}
		}
		
		
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			viewW = getWidth(); viewH = getHeight();
			Graphics2D g2d = (Graphics2D)g;
			g2d.drawImage(ball, ballTask.x, ballTask.y, null);
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		new MyGame();
	}

}
