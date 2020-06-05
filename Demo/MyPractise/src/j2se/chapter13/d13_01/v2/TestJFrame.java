package j2se.chapter13.d13_01.v2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestJFrame{
	public static void main(String[] args){
		JFrame jf = new JFrame("My Test");
		jf.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));
		JLabel greet = new JLabel("Hello,World !");
		JLabel bye = new JLabel(" Bye,World ! ");
		bye.setBackground(Color.BLUE);
		bye.setOpaque(true);
		jf.add(greet);
		jf.add(bye);
		jf.getContentPane().setBackground(Color.GREEN);
		jf.setSize(200,100);
		jf.setLocation(400,200);
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});
		jf.setVisible(true);
	}	
}