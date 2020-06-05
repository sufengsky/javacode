package j2se.chapter12.d12_09;

import java.awt.Frame;
import java.awt.Button;
public class TestActionEvent2 {
    public static void main(String args[]) {
		Frame f = new Frame("Test");
		Button b1 = new Button("Start");
		Button b2 = new Button("Stop");
		Monitor2 bh = new Monitor2();
		b1.addActionListener(bh);       
		b2.addActionListener(bh);
		b2.setActionCommand("Game over!");
		f.add(b1,"North");       
		f.add(b2,"Center");	
		f.pack();        		
		f.setVisible(true);
    }
}
