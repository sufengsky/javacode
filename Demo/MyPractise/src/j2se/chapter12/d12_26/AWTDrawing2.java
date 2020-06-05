package j2se.chapter12.d12_26;

import java.awt.*;
import java.awt.event.*;
class MyCanvas extends Canvas{
	private Image im;
	public void setImage(Image im){
		this.im = im;
	}
	public void paint(Graphics g){
		g.drawImage(im,0,0,this);
	}	
}	

public class AWTDrawing2 {
	public static void main( String args[]) {
	    Frame f = new Frame("ShowImage");
	    MyCanvas mc = new MyCanvas();
	    Image image = Toolkit.getDefaultToolkit().createImage("a.jpg");
	    mc.setImage(image);
 	    f.add(mc);
	    f.setSize(300,200);
	    f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
	    f.setVisible( true); 
	}
}
