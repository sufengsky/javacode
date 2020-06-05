package j2se.chapter12.d12_09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Monitor2 implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());    
	}
}
