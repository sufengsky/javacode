import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TestInner {
	Frame f = new Frame("�ڲ������");
	TextField tf = new TextField(30);
	public TestInner(){
		f.add(new Label("�밴�����������϶�"), "North");
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
			String s = "����϶���λ�ã�" + e.getX() + "," + e.getY() + ")";
			tf.setText(s);
		}
		
		public void mouseEntered(MouseEvent e) {
			String s = "����ѽ��봰��";
			tf.setText(s);
		}
		
		public void mouseExited(MouseEvent e) {
			String s = "������Ƴ�����";
			tf.setText(s);
		}
		public void mouseMoved(MouseEvent e) { }
		public void mousePressed(MouseEvent e) { }
		public void mouseClicked(MouseEvent e) { }
		public void mouseReleased(MouseEvent e) { }
	}
}
