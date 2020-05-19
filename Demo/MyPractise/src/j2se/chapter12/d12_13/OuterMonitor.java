import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class OuterMonitor implements MouseMotionListener,MouseListener {
	private TextField tf;
	public OuterMonitor(TextField tf){
		this.tf = tf;	
	}
	
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
