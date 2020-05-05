import java.awt.Frame;
public class TestAdapter{
    public static void main(String args[]){
		Frame f = new Frame("Java Gui");
		f.setSize(150,150);
		MyAdapter m = new MyAdapter();
		f.addWindowListener(m);
		f.setVisible(true);
	}	
}
