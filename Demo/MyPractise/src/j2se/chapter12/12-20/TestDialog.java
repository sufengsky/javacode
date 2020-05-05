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
		Frame f = new Frame("ע�ᴰ��");
		Button login = new Button("��¼");
		Button regist = new Button("ע��");
		Button help = new Button("����");
		Button exit = new Button("�˳�");
		Panel p = new Panel();
		p.setLayout(new GridLayout(1,4));		
		p.add(login);
		p.add(regist);
		p.add(help);
		p.add(exit);
		info = new Label("����δ��¼");
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
		Dialog d = new Dialog(f,"��¼�Ի���",true);
		Label note = new Label("������ע����Ϣ");
		
		Panel pa = new Panel();
		pa.setLayout(new GridLayout(2,1));
		pa.add(new Label("�û���:"));		
		pa.add(new Label("��  ��:"));	
		
		Panel pc = new Panel();	
		pc.setLayout(new GridLayout(2,1));
		tf_name = new TextField();
		tf_psw = new TextField(); 
		tf_psw.setEchoChar('*');
		pc.add(tf_name);		
		pc.add(tf_psw);		
		
		Panel pb = new Panel();
		pb.setLayout(new GridLayout(1,2));
		Button submit = new Button("�ύ");	
		Button cancel = new Button("ȡ��");	
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
		Dialog d = new Dialog(f,"ȷ���˳��Ի���",true);
		Label note = new Label("��ȷ��Ҫ�˳�������");
		Panel p = new Panel();
		//p.setLayout(new GridLayout(1,2));
		Button confirm = new Button("ȷ��");	
		Button cancel = new Button("ȡ��");	
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
		if(s.equals("��¼")){
			loginDialog.setVisible(true);
		}else if(s.equals("�˳�")){
			this.quit();	
		}else if(s.equals("confirmQuit")){
			System.exit(0);	
		}else if(s.equals("cancelQuit")){
			quitDialog.setVisible(false);	
		}else if(s.equals("submitLogin")){
			String name = tf_name.getText();
			String password = tf_psw.getText();
			if(name.equals("Scott") && password.equals("Tiger")){
				info.setText("��ӭ��: " + name + " �û�");	
			}else{
				info.setText("��֤ʧ�ܣ�������û���/����!");	
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