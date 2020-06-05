package j2se.chapter19.d19_03;

import java.awt.*;
import javax.swing.*;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.text.DateFormat;

public class TestResourceBundle{
	private static ResourceBundle bundle;
	private static Locale currentLocale;
	static{
		currentLocale = Locale.getDefault();
		bundle = ResourceBundle.getBundle("MyLabels",currentLocale);	
	}
	
	public static void main(String args[]){
		JFrame jf = new JFrame(bundle.getString("title"));
		JMenuBar jmb = new JMenuBar();
		JMenu jm1 = new JMenu(bundle.getString("menu.file"));
		JMenu jm2 = new JMenu(bundle.getString("menu.edit"));
		JMenu jm3 = new JMenu(bundle.getString("menu.help"));		
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jf.setJMenuBar(jmb);
		
		JTextArea status = new JTextArea();
		status.setText(bundle.getString("currentEnv") + currentLocale.getDisplayName());		
		Color bg = (Color)bundle.getObject("bgColor");
		status.setBackground(bg);
		
		JLabel time = new JLabel();
		jf.add(status,"Center");
		jf.add(time,"South");		
		jf.setSize(350,200);
		jf.setLocation(400,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		jf.setVisible(true);
		
		MyTimer mt = new MyTimer(time);
		mt.start();
	}
}

class MyTimer extends Thread{
	JLabel status;
	public MyTimer(JLabel status){
		this.status = status;	
	}
	public void run(){
		Locale locale = Locale.getDefault();
		while(true){
			Date now = new Date();
			DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL,locale);		
			status.setText(df.format(now));
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();	
			}	
		}
	}
}