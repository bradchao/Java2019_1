package tw.org.iii.myjava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;

public class MyView extends JPanel {
	private LinkedList<HashMap<String,Integer>> line;
	
	
	public MyView() {
		setBackground(Color.YELLOW);
		MyMouseListener myMouseListener = new MyMouseListener();
		addMouseListener(myMouseListener);
		addMouseMotionListener(myMouseListener);
		
		line = new LinkedList<>();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(Color.BLUE);
		g2d.setStroke(new BasicStroke(4));

		for (int i=1; i<line.size(); i++) {
			HashMap<String,Integer> p0 = line.get(i-1);
			HashMap<String,Integer> p1 = line.get(i);
			g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
			
		}
		
		
		
		
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			int ex = e.getX(), ey = e.getY();
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", ex); point.put("y", ey);
			line.add(point);
			
			repaint();
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			
			int ex = e.getX(), ey = e.getY();
			HashMap<String,Integer> point = new HashMap<>();
			point.put("x", ex); point.put("y", ey);
			line.add(point);
			
		}
		 
	}
	
}
