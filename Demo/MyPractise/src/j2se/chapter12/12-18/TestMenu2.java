import java.awt.*;
import java.awt.event.*;
public class TestMenu2{
	private Frame f = new Frame("测试窗口");
	private Label message = new Label();
	private PopupMenu pm;	

	public static void main( String args[]) {
		new TestMenu2().createUI();
	}
	
	public void createUI(){
		f.add(message,"Center");		
		MyMonitor mm = new MyMonitor();		
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("格式");
		Menu m3 = new Menu("帮助");
			
		MenuItem m21 = new MenuItem("字体");
		Menu m22 = new Menu("背景");
		
		MenuItem bg_red = new MenuItem("红色");  
		MenuItem bg_blue = new MenuItem("蓝色");  
		MenuItem bg_green = new MenuItem("绿色");  
		MenuItem bg_customize = new MenuItem("用户自定义");  

		bg_red.addActionListener(mm);
		bg_blue.addActionListener(mm);
		bg_green.addActionListener(mm);
		bg_customize.addActionListener(mm);
				 
		m22.add(bg_red);
		m22.add(bg_blue);
		m22.add(bg_green);	
		m22.addSeparator();	
		m22.add(bg_customize);
		
		m2.add(m21);
		m2.add(m22);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		f.setMenuBar(mb);
		
		pm = new PopupMenu();	
		MenuItem start = new MenuItem("Start");
		MenuItem stop = new MenuItem("Stop");
		pm.add(start);
		pm.add(stop);
		start.addActionListener(mm);
		stop.addActionListener(mm);
		message.add(pm);

		message.addMouseListener(mm);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
		f.setSize(200,150);
		f.setLocation(300,100);
		f.setVisible( true);
	}
	
	public class MyMonitor extends MouseAdapter implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String s = e.getActionCommand();
			if(s.equals("红色")){
				message.setBackground(Color.RED); 
			}else if(s.equals("蓝色")){
				message.setBackground(Color.BLUE); 
			}else if(s.equals("绿色")){
				message.setBackground(Color.GREEN); 
			}else if(s.equals("Start")){
				message.setText("生活多美好！"); 
			}else if(s.equals("Stop")){
				message.setText("Bye-bye,the world!"); 
			}	
		}
		@Override
		public void mousePressed(MouseEvent e){
			if(e.isPopupTrigger()){
				pm.show(message,e.getX(),e.getY());	
			}	
		}
		@Override
		public void mouseReleased(MouseEvent e){
			if(e.isPopupTrigger()){
				pm.show(message,e.getX(),e.getY());	
			}	
		}
	}
}