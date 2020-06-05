package j2se.chapter12.d12_16;

import java.awt.*;
import java.awt.event.*;

public class TestTextArea{
	public static void main( String args[]) {
		Frame f = new Frame("留言板");
		TextArea message = new TextArea(20,20);
		f.add(new Label("请您留言:"),"North");
		f.add(message,"Center");
				
		Panel p = new Panel();	
		p.setLayout(new GridLayout(1,6));
		
		String[] buttonLabels = {"剪切","复制","粘贴","删除","提交","清除"};
		String[] buttonActionCommands = {"CUT","COPY","PASTE","DELETE","SUBMIT","RESET"};
		Button[] buttons = new Button[6];		
		OuterMonitor om = new OuterMonitor(message,buttons);
		
		for(int i=0;i<buttons.length;i++){
			buttons[i] = new Button(buttonLabels[i]);	
			buttons[i].setActionCommand(buttonActionCommands[i]);
			if(i<4){
				buttons[i].setEnabled(false);
			}
			buttons[i].addActionListener(om);
			p.add(buttons[i]);
		}		
		message.addMouseMotionListener(om);
		
		f.add(p,"North");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
		f.setSize(300,150);
		f.setLocation(300,100);
		f.setVisible( true);
	}
}