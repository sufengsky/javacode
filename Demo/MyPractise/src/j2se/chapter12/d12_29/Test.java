package j2se.chapter12.d12_29;

import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;
public class Test extends Applet {
	private String topic;
	public void init () { 
		topic = this.getParameter("topic"); 
		this.setBackground(new Color(120,180,140));  
	}
	public void paint(Graphics g) { 
		g.drawString (topic,25, 25) ; 
	}
}
