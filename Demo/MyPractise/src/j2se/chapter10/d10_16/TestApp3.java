import java.awt.*;
import java.awt.event.*;
public class TestApp3{
	public static void main(String[] args){
		Frame f = new Frame("测试程序");
		f.setSize(200,200);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});
		f.setVisible(true);	
	}	
}