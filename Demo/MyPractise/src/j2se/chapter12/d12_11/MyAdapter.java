package j2se.chapter12.d12_11;

import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class MyAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(1);	
	}
}