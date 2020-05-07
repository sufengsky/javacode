import java.awt.*;
import java.awt.event.*;
public class TestMenu{
	public static void main( String args[]) {
		Frame f = new Frame("记事本");
		TextArea ta = new TextArea("",20,20);
		f.add(ta,"Center");
		
		MyMonitor mm = new MyMonitor();
		
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("文件");
		Menu m2 = new Menu("编辑");
		Menu m3 = new Menu("格式");
		Menu m4 = new Menu("帮助");
		
		MenuItem mi11 = new MenuItem("新建");  
		MenuItem mi12 = new MenuItem("打开");  
		MenuItem mi13 = new MenuItem("保存");  
		MenuItem mi14 = new MenuItem("另存为");  
		MenuItem mi15 = new MenuItem("退出"); 
		mi15.addActionListener(mm);		 
		m1.add(mi11);
		m1.add(mi12);
		m1.add(mi13);
		m1.add(mi14);
		m1.addSeparator();
		m1.add(mi15);
		
		CheckboxMenuItem mi31 = new CheckboxMenuItem("二进制");
		MenuItem mi32 = new MenuItem("字体");
		mi31.addActionListener(mm);
		m3.add(mi31);
		m3.add(mi32);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		f.setMenuBar(mb);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
		f.setSize(300,200);
		f.setLocation(300,100);
		f.setVisible( true);
	}
}