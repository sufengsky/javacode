package j2se.chapter13.d13_01;

import java.awt.Container;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestJFrame{
	public static void main(String[] args){
		JFrame jf = new JFrame("My Test");
		Container c = jf.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		JLabel greet = new JLabel("Hello,World !");
		JLabel bye = new JLabel(" Bye,World ! ");
		bye.setBackground(Color.BLUE);
		bye.setOpaque(true);
		c.add(greet);
		c.add(bye);
		c.setBackground(Color.GREEN);
		jf.setSize(200,100);
		jf.setLocation(400,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
}
