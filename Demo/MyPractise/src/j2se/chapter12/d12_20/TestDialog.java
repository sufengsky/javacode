import java.awt.*;
import java.awt.event.*;
public class TestDialog implements ActionListener{
	private Label info;
	private Dialog loginDialog;
	private Dialog quitDialog;
	private TextField tf_name;
	private TextField tf_psw;
	public static void main( String args[]) {
		new TestDialog().init();
	}
	
	public void init(){
		Frame f = new Frame("注册窗口");
		Button login = new Button("登录");
		Button regist = new Button("注册");
		Button help = new Button("帮助");
		Button exit = new Button("退出");
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,4));		
		p.add(login);
		p.add(regist);
		p.add(help);
		p.add(exit);
		info = new Label("您尚未登录");
		f.add(p,"North");		
		f.add(info,"Center");
		
		login.addActionListener(this);
		exit.addActionListener(this);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				TestDialog.this.quit();	
			}	
		});  
		f.setSize(200,150);
		f.setLocation(450,200);
		f.setVisible( true);
		loginDialog = this.createLoginDialog(f);
		quitDialog = this.createQuitDialog(f);
	}
	
	public Dialog createLoginDialog(Frame f){
		Dialog d = new Dialog(f,"登录对话框",true);
		Label note = new Label("请输入注册信息");
		
		Panel pa = new Panel();
		pa.setLayout(new GridLayout(2,1));
		pa.add(new Label("用户名:"));		
		pa.add(new Label("密  码:"));	
		
		Panel pc = new Panel();	
		pc.setLayout(new GridLayout(2,1));
		tf_name = new TextField();
		tf_psw = new TextField(); 
		tf_psw.setEchoChar('*');
		pc.add(tf_name);		
		pc.add(tf_psw);		
		
		Panel pb = new Panel();
		pb.setLayout(new GridLayout(1,2));
		Button submit = new Button("提交");	
		Button cancel = new Button("取消");	
		submit.setActionCommand("submitLogin");
		cancel.setActionCommand("cancelLogin");
		submit.addActionListener(this);
		cancel.addActionListener(this);
		pb.add(submit);
		pb.add(cancel);
		
		d.add(note,"North");
		d.add(pa,"West");
		d.add(pc,"Center");
		d.add(pb,"South");
		d.setSize(160,120);
		d.setLocation(400,200);		
		return d;
	}
	
	public Dialog createQuitDialog(Frame f){
		Dialog d = new Dialog(f,"确认退出对话框",true);
		Label note = new Label("您确定要退出程序吗？");
		Panel p = new Panel();
		//p.setLayout(new GridLayout(1,2));
		Button confirm = new Button("确定");	
		Button cancel = new Button("取消");	
		confirm.setActionCommand("confirmQuit");
		cancel.setActionCommand("cancelQuit");
		confirm.addActionListener(this);
		cancel.addActionListener(this);
		p.add(confirm);
		p.add(cancel);
		d.setSize(160,120);
		d.setLocation(400,200);
		d.add(note,"Center");
		d.add(p,"South");
		return d;
	}
	
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("登录")){
			loginDialog.setVisible(true);
		}else if(s.equals("退出")){
			this.quit();	
		}else if(s.equals("confirmQuit")){
			System.exit(0);	
		}else if(s.equals("cancelQuit")){
			quitDialog.setVisible(false);	
		}else if(s.equals("submitLogin")){
			String name = tf_name.getText();
			String password = tf_psw.getText();
			if(name.equals("Scott") && password.equals("Tiger")){
				info.setText("欢迎您: " + name + " 用户");	
			}else{
				info.setText("验证失败，错误的用户名/密码!");	
			}
			loginDialog.setVisible(false);	
		}else if(s.equals("cancelLogin")){
			loginDialog.setVisible(false);	
		}
	}
	public void quit(){
		quitDialog.setVisible(true);	
	}
}