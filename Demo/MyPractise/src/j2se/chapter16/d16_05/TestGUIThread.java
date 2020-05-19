import java.awt.*;
import java.awt.event.*;
public class TestGUIThread {	
	public static void main(String args[]) throws Exception{
		
		Frame f = new Frame();
		Button b = new Button("Press Me!");
		MyMonitor mm = new MyMonitor();
		b.addActionListener(mm);
		f.addWindowListener(mm);	
		f.add(b,"Center");	
		f.setSize(100,60);
		f.setVisible(true);
		MyThreadViewer.view();
	}
}

class MyMonitor extends WindowAdapter implements ActionListener{
	public void actionPerformed(ActionEvent e){
		MyThreadViewer.view();	
	}
}

class MyThreadViewer{
	public static void view(){
		Thread current = Thread.currentThread();
		System.out.println("当前线程名称: " + current.getName());
		int total = Thread.activeCount();
		System.out.println("活动线程总数: " + total + "个");
		Thread[] threads = new Thread[total];		
		current.enumerate(threads);
		for(Thread t : threads){
			String role = t.isDaemon()?"后台线程 ":"用户线程 ";
			System.out.println("   -" + role + t.getName());	
		}	
		System.out.println("----------------------------------");
	}	
}
