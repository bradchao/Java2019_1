package tw.org.iii.myjava;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyView extends JPanel {
	private LinkedList<LinkedList<MyPoint>> lines, recycler;
	private int viewW, viewH;
	private boolean isInit;
	private Color color;
	
	public MyView() {
		setBackground(Color.YELLOW);
		MyMouseListener myMouseListener = new MyMouseListener();
		addMouseListener(myMouseListener);
		addMouseMotionListener(myMouseListener);
		
		lines = new LinkedList<>();
		recycler = new LinkedList<>();
		
		color = Color.BLUE;
		
	}

	private void init() {
		viewW = getWidth(); viewH = getHeight();
		System.out.println(viewW + " x " + viewH);
		isInit = true;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		if (!isInit) init();
		
		Graphics2D g2d = (Graphics2D)g;
		
		g2d.setColor(color);
		g2d.setStroke(new BasicStroke(4));

//		for (LinkedList<HashMap<String,Integer>> line : lines) {
//			for (int i=1; i<line.size(); i++) {
//				HashMap<String,Integer> p0 = line.get(i-1);
//				HashMap<String,Integer> p1 = line.get(i);
//				g2d.drawLine(p0.get("x"), p0.get("y"), p1.get("x"), p1.get("y"));
//				
//			}
//		}
		for (LinkedList<MyPoint> line : lines) {
			for (int i=1; i<line.size(); i++) {
				MyPoint p0 = line.get(i-1);
				MyPoint p1 = line.get(i);
				g2d.drawLine(p0.getX(), p0.getY(), p1.getX(), p1.getY());
				
			}
		}
	}
	
	public Color getPaintColor() {return color;}
	public void setPaintColor(Color color) {
		this.color=color;
		repaint();
	}
	
	private class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
//			HashMap<String,Integer> point = parsePoint(e);
			MyPoint point = parseMyPoint(e);
			
			lines.getLast().add(point);
			repaint();
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
//			HashMap<String,Integer> point = parsePoint(e);
			MyPoint point = parseMyPoint(e);
			
			// a new Line
			LinkedList<MyPoint> line = new LinkedList<>();
			line.add(point);
			
			lines.add(line);
			
			recycler.clear();
			
		}
		
		 
	}
	
	public void clearView() {
		lines.clear();
		recycler.clear();
		repaint();
	}
	
	public void undo() {
		if (lines.size()>0) {
			recycler.add(lines.removeLast());
			repaint();
		}
	}
	
	public void redo() {
		if (recycler.size()>0) {
			lines.add(recycler.removeLast());
			repaint();
		}
	}
	
	public LinkedList<LinkedList<MyPoint>> getLines(){
		return lines;
	}
	public void setLines(LinkedList<LinkedList<MyPoint>> lines) {
		this.lines = lines;
		repaint();
	}
	
	public void saveJPEG(String filename) throws IOException {
		BufferedImage paintImage = new BufferedImage(viewW, viewH, BufferedImage.TYPE_3BYTE_BGR);
		Graphics2D g2d = paintImage.createGraphics();
		paint(g2d);
		
		try{
	        ImageIO.write(paintImage, "jpeg", new File(filename));
        }catch(IOException e){
        	throw new IOException();
        }
		
	}
	
	private static HashMap<String,Integer> parsePoint(MouseEvent e){
		int ex = e.getX(), ey = e.getY();
		HashMap<String,Integer> point = new HashMap<>();
		point.put("x", ex); point.put("y", ey);
		return point;
	}
	private static MyPoint parseMyPoint(MouseEvent e){
		int ex = e.getX(), ey = e.getY();
		return new MyPoint(ex, ey);
	}
	
}

class MyPoint implements Serializable{
	private int x, y;
	MyPoint(int x, int y){this.x=x; this.y=y;}
	int getX() {return x;}
	int getY() {return y;}
}
class MyLine implements Serializable {
	private LinkedList<MyPoint> line;
	private Color color;
	private float width;
	
}


