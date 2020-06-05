package j2se.chapter12.d12_15;

import java.awt.*;
import java.awt.event.*;

public class TestTextField implements ActionListener{
	TextField name;
	TextField password;
	
	public static void main( String args[]) {
		TestTextField ttf = new TestTextField();
		ttf.createUI();
	}
	
	public void createUI(){
		Frame f = new Frame("登录界面");
		f.add(new Label("请输入您的用户信息:"),"North");
		
		Panel p1 = new Panel();
		p1.setLayout(new BorderLayout());		
		Panel p11 = new Panel();
		p11.setLayout(new GridLayout(2,1));
		p11.add(new Label("用户名:"));
		p11.add(new Label("密  码:"));		
		Panel p12 = new Panel();
		p12.setLayout(new GridLayout(2,1));
		name = new TextField(10);
		name.addActionListener(this);
		password = new TextField(10);
		password.setEchoChar('*');
		password.addActionListener(this);
		p12.add(name);
		p12.add(password);		
		p1.add(p11,"West");
		p1.add(p12,"Center");
		
		Panel p2 = new Panel();		
		Button submit = new Button("提交");
		Button reset = new Button("重置");
		submit.addActionListener(this);
		reset.addActionListener(this);

		p2.add(submit);
		p2.add(reset);
		
		f.add(p1,"Center");
		f.add(p2,"South");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
		f.setSize(200,130);
		f.setLocation(300,200);
		f.setVisible( true);
	}
	
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("重置")){
			this.clear();
		}else if(s.equals("提交") || (e.getSource()==name) || (e.getSource()==password)){
			this.submit();	
		}			
	}	
	public void clear(){
		name.setText("");
		password.setText("");	
	}
	public void submit(){
		String n = name.getText();
		String psw = password.getText();
		System.out.println("用户名:" + n + "\t密码:" + psw);	
	}
}
