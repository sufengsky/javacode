import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class TestAnonymousMonitor{
	Frame f = new Frame("�����ڲ������");
	TextField tf = new TextField(30);
	public TestAnonymousMonitor(){
		f.add(new Label("�밴�����������϶�"), "North");
		f.add(tf, "South");
		f.addMouseMotionListener(new MouseMotionAdapter(){
			   public void mouseDragged(MouseEvent e) {
			      tf.setText("���λ��" + e.getPoint());
			   }	
		});
		f.setBackground(Color.CYAN);
		f.setSize(300, 200);	 
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});   	
		f.setVisible(true);
	}
	public static void main(String args[]) {   	
		new TestAnonymousMonitor();
	}

}