import java.awt.*;
class MyCanvas extends Canvas{
	public void paint(Graphics g){
		g.setFont(new Font("�����п�",Font.PLAIN,20));
		g.setColor(Color.RED);
		g.drawString("��ͼ����!",20,20);	
		g.drawLine(30,60,100,60);
		g.setColor(Color.BLUE);
		g.draw3DRect(60,50,70,30,false);
		g.setColor(Color.BLUE);
	    g.fillArc(0,60,65,65,40,80);
		g.setFont(new Font("���Ĳ���",Font.PLAIN,30));
		g.setColor(Color.PINK);
		g.drawString("����֮��",20,120);	
	}	
}	

public class AWTDrawing {
	public static void main( String args[]) {
	    Frame f = new Frame("AWT��ͼ");
	    MyCanvas p = new MyCanvas();
	    f.add(p);
	    f.setSize(170,170);
	    f.setBackground( new Color(160,220,220));
	    f.setVisible( true); 
    }
}
