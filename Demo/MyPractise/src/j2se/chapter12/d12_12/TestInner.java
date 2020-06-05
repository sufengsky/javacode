package j2se.chapter12.d12_12;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TestInner {
	Frame f = new Frame("内部类测试");
	TextField tf = new TextField(30);
	public TestInner(){
		f.add(new Label("请按下鼠标左键并拖动"), "North");
		f.add(tf, "South");
		
		InnerMonitor im = new InnerMonitor();
		f.addMouseMotionListener(im);
		f.addMouseListener(im);
		f.setBackground(new Color(120,175,175));
		f.setSize(300, 200);	    	
		f.setVisible(true);
	}
	public static void main(String args[]) {   	
		TestInner t = new TestInner();
	}
	
	private class InnerMonitor implements MouseMotionListener,MouseListener {
		public void mouseDragged(MouseEvent e) {
			String s = "鼠标拖动到位置（" + e.getX() + "," + e.getY() + ")";
			tf.setText(s);
		}
		
		public void mouseEntered(MouseEvent e) {
			String s = "鼠标已进入窗体";
			tf.setText(s);
		}
		
		public void mouseExited(MouseEvent e) {
			String s = "鼠标已移出窗体";
			tf.setText(s);
		}
		public void mouseMoved(MouseEvent e) { }
		public void mousePressed(MouseEvent e) { }
		public void mouseClicked(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }
	}
}
