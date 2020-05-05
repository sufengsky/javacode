import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class TestMultiListener implements 
	MouseMotionListener,MouseListener {
	Frame f = new Frame("多重监听器测试");
	TextField tf = new TextField(30);
	
	public TestMultiListener(){
		Label guide = new Label("请按下鼠标左键并拖动");
		f.add(guide, "North");
		f.add(tf, "South");
		f.setBackground(new Color(180,225,225));
		f.addMouseMotionListener(this);
		f.addMouseListener(this);
		f.setSize(300, 200);	    	
		f.setVisible(true);
	}
	public static void main(String args[]) {   	
		TestMultiListener t = new TestMultiListener();
	}
	public void mouseDragged(MouseEvent e) {
		String s = "鼠标拖动到位置（" + e.getX() + 
			"," + e.getY() + ")";
		tf.setText(s);
	}	
	public void mouseEntered(MouseEvent e) {
		tf.setText("鼠标已进入窗体");
	}	
	public void mouseExited(MouseEvent e) {
		tf.setText("鼠标已移出窗体");
	}
	public void mouseMoved(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
}
