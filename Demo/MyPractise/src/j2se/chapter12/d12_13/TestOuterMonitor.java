package j2se.chapter12.d12_13;

import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Color;

public class TestOuterMonitor{
	Frame f = new Frame("内部类测试");
	TextField tf = new TextField(30);
	public void work(){
		f.add(new Label("请按下鼠标左键并拖动"), "North");
		f.add(tf, "South");
		
		OuterMonitor om = new OuterMonitor(tf);
		f.addMouseMotionListener(om);
		f.addMouseListener(om);
		f.setBackground(new Color(120,175,175));
		f.setSize(300, 200);	    	
		f.setVisible(true);
	}
	public static void main(String args[]) {   	
		TestOuterMonitor t = new TestOuterMonitor();
		t.work();
	}
}