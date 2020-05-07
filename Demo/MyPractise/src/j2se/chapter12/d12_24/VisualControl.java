import java.awt.*;
import java.awt.event.*;
public class VisualControl{
	public static void main( String args[]) {
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		int total = fonts.length;
		Frame frame = new Frame("Test Visual Control");
		Panel p = new Panel();
		p.setLayout(new GridLayout(total,3));
		Button cell;
		for(int i=0;i<total;i++){
			fonts[i] = fonts[i].trim();
			cell = new Button(fonts[i]);
			cell.setBackground(new Color(94,150,150));
			cell.setFont(new Font(fonts[i],Font.PLAIN,12));
			p.add(cell);
			
			cell = new Button(fonts[i]);
			cell.setBackground(Color.BLACK);
			cell.setForeground(Color.WHITE);
			cell.setFont(new Font(fonts[i],Font.BOLD,12));
			p.add(cell);
			
			cell = new Button(fonts[i]);
			cell.setForeground(Color.RED);
			cell.setFont(new Font(fonts[i],Font.ITALIC,12));
			p.add(cell);
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
		frame.setVisible(true);		
	}
}