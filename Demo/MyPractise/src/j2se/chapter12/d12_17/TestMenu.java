import java.awt.*;
import java.awt.event.*;
public class TestMenu{
	public static void main( String args[]) {
		Frame f = new Frame("���±�");
		TextArea ta = new TextArea("",20,20);
		f.add(ta,"Center");
		
		MyMonitor mm = new MyMonitor();
		
		MenuBar mb = new MenuBar();
		Menu m1 = new Menu("�ļ�");
		Menu m2 = new Menu("�༭");
		Menu m3 = new Menu("��ʽ");
		Menu m4 = new Menu("����");
		
		MenuItem mi11 = new MenuItem("�½�");  
		MenuItem mi12 = new MenuItem("��");  
		MenuItem mi13 = new MenuItem("����");  
		MenuItem mi14 = new MenuItem("���Ϊ");  
		MenuItem mi15 = new MenuItem("�˳�"); 
		mi15.addActionListener(mm);		 
		m1.add(mi11);
		m1.add(mi12);
		m1.add(mi13);
		m1.add(mi14);
		m1.addSeparator();
		m1.add(mi15);
		
		CheckboxMenuItem mi31 = new CheckboxMenuItem("������");
		MenuItem mi32 = new MenuItem("����");
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