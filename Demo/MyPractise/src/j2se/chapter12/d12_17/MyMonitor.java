package j2se.chapter12.d12_17;

import java.awt.*;
import java.awt.event.*;

public class MyMonitor implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		System.out.println(s);
		if(s.equals("退出")){
			System.exit(0);	
		}	
	}
}