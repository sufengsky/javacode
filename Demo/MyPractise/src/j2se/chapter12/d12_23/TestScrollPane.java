import java.awt.*;
import java.awt.event.*;
public class TestScrollPane{
	public static void main( String args[]) {
		Frame frame = new Frame("表格效果");
		Panel p = new Panel();
		p.setLayout(new GridLayout(10,5));
		TextField[] cells = new TextField[50];
		for(int i=0;i<50;i++){
			cells[i] = new TextField(String.valueOf(i),5);
			p.add(cells[i]);	
		}
		
		ScrollPane sp = new ScrollPane();
		sp.add(p);
		frame.add(sp,"Center");
		frame.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
		frame.setSize(250,180);
		frame.setLocation(450,200);
		frame.setVisible( true);		
	}
}