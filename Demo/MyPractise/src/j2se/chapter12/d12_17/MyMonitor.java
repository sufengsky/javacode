import java.awt.*;
import java.awt.event.*;

public class MyMonitor implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		System.out.println(s);
		if(s.equals("�˳�")){
			System.exit(0);	
		}	
	}
}