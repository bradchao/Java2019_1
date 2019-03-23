package tw.org.iii.myjava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class MyView extends JPanel {
	public MyView() {
		setBackground(Color.YELLOW);
		MyMouseListener myMouseListener = new MyMouseListener();
		addMouseListener(myMouseListener);
		addMouseMotionListener(myMouseListener);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(0, 0, 400, 400);
		
		
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			System.out.println("dragged");
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			System.out.println("pressed");
		}
		 
		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			System.out.println("released");
		}
		
	}
	
}
