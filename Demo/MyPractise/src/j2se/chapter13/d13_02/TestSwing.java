package j2se.chapter13.d13_02;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestSwing implements ActionListener{
	public static void main(String[] args){
		new TestSwing().createUI();
	}
	public void createUI(){
		JFrame jf = new JFrame("My Test");
		JMenuBar jmb = new JMenuBar();
		JMenu menu_file = new JMenu("File");
		JMenu menu_help = new JMenu("Help");
		JMenuItem mi_new = new JMenuItem("New");
		JMenuItem mi_open = new JMenuItem("Open");
		JMenuItem mi_save = new JMenuItem("Save");
		mi_new.addActionListener(this);
		mi_open.addActionListener(this);
		mi_save.addActionListener(this);
		mi_new.setMnemonic('N');
		mi_open.setMnemonic('O');
		mi_save.setMnemonic('S');
		menu_file.setMnemonic('F');
		menu_help.setMnemonic('h');  
		menu_file.add(mi_new);
		menu_file.add(mi_open);
		menu_file.add(mi_save);
		jmb.add(menu_file);
		jmb.add(menu_help);
				
		JToolBar jtb = new JToolBar();
		JButton button_new = new JButton(new ImageIcon("new.gif"));
		JButton button_open = new JButton(new ImageIcon("open.gif"));
		JButton button_save = new JButton(new ImageIcon("save.gif"));
		button_new.setActionCommand("New");
		button_open.setActionCommand("Open");
		button_save.setActionCommand("Save");
		button_new.setToolTipText("新建文件");
		button_open.setToolTipText("打开文件");
		button_save.setToolTipText("保存文件");
		button_new.addActionListener(this);
		button_open.addActionListener(this);
		button_save.addActionListener(this);
		jtb.add(button_new);
		jtb.add(button_open);
		jtb.add(button_save);
		
		JPanel jp = new JPanel();
		JButton button_start = new JButton("Start");		
		JButton button_stop = new JButton("Stop");		
		button_start.setToolTipText("开始操作");
		button_stop.setToolTipText("结束操作");
		button_start.setMnemonic('S');
		button_stop.setMnemonic('t');
		button_start.addActionListener(this);
		button_stop.addActionListener(this);
		jp.add(button_start);
		jp.add(button_stop);
		
		jf.setJMenuBar(jmb);
		jf.add(jtb,"North");
		jf.add(jp,"South");
		jf.setSize(300,200);
		jf.setLocation(400,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getActionCommand());	
	}
}
