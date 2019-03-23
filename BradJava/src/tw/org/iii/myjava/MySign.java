package tw.org.iii.myjava;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MySign extends JFrame{
	private JButton clear, undo, redo, saveJPEG, saveObj, loadObj, changeColor;
	private MyView myView;
	
	public MySign() {
		super("簽名城市");
		
		setLayout(new BorderLayout());
	
		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		saveJPEG = new JButton("Save JPG");
		saveObj = new JButton("Save Obj");
		loadObj = new JButton("Load Obj");
		changeColor = new JButton("Color");
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(clear);top.add(undo);top.add(redo); top.add(saveJPEG);
		top.add(saveObj); top.add(loadObj);top.add(changeColor);
		
		add(top, BorderLayout.NORTH);
		
		myView = new MyView();
		add(myView, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.clearView();
			}
		});
		
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.undo();
			}
		});
		
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.redo();
			}
		});
		
		saveJPEG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				if (jfc.showSaveDialog(MySign.this) == JFileChooser.APPROVE_OPTION) {
					File file = jfc.getSelectedFile();
					try {
						myView.saveJPEG(file.getAbsolutePath());
						JOptionPane.showMessageDialog(null, "Save Jpeg OK");
					}catch(Exception ee) {
						JOptionPane.showMessageDialog(null, "Save Jpeg Fail");
					}
				}
			}
		});

		saveObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObj();
			}
		});
		loadObj.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObj();
			}
		});
		changeColor.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void changeColor() {
		Color newColor = JColorChooser.showDialog(this, "選畫筆顏色", myView.getPaintColor());
		myView.setPaintColor(newColor);
		
	}
	
	private void saveObj() {
		LinkedList<LinkedList<MyPoint>> lines = myView.getLines();
		try {
			ObjectOutputStream oout = 
				new ObjectOutputStream(new FileOutputStream("mytest/mysign.obj"));
			oout.writeObject(lines);
			oout.flush();
			oout.close();
			JOptionPane.showMessageDialog(null, "Save Obj OK");
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Save Obj Fail");
		}
	}
	
	private void loadObj() {
		try {
			ObjectInputStream oin = 
					new ObjectInputStream(new FileInputStream("mytest/mysign.obj"));
			LinkedList<LinkedList<MyPoint>> lines = 
					(LinkedList<LinkedList<MyPoint>>)oin.readObject();
			oin.close();
			myView.setLines(lines);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Load fail");
		}
	}
	
	
	public static void main(String[] args) {
		new MySign();
	}

}
