package j2se.chapter12.d12_08;

import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;

public class TestActionEvent {
    public static void main(String args[]) {
		Frame f = new Frame("Test");
		Button b = new Button("Press Me!");
		MyMonitor mm = new MyMonitor();
		b.addActionListener(mm);
		f.add(b,BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
    }
}
