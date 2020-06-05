package j2se.chapter12.d12_03;

import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;

public class TestFlowLayout {
	public static void main(String args[]) {
		Frame f = new Frame("Flow Layout");
		Button button1 = new Button("Ok");
		Button button2 = new Button("Open");
		Button button3 = new Button("Close");
		f.setLayout(new FlowLayout());
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.setSize(100,100);
		f.setVisible(true);
	}
}
