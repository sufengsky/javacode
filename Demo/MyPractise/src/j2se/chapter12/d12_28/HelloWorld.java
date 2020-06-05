package j2se.chapter12.d12_28;

import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;
public class HelloWorld extends Applet {
	String text ;
	public void init () {
		text = "Hello World";
		this.setBackground(new Color(120,180,140));
	}
	public void paint(Graphics g) {
		g.drawString (text , 25, 25) ;
	}
}