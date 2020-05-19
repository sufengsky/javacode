import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TableExample{
	public static void main(String args[]){		
		JFrame myFrame = new JFrame("Table Example");
		Object data[][] ={
			{1,"张三","男","18","010.82607080"},
			{2,"李四","女","24","021.68720890"},
			{3,"王五","男","43","0459.4990893"},
			{4,"赵六","男","32","010.67887098"},
			{5,"任七","女","15","010.84682089"},
			{6,"吴八","男","76","010.63540177"},
		};
		String columnNames[] ={"编号","姓名","性别","年龄","电话"};
		JTable table = new JTable(data,columnNames);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		//JScrollPane pane = new JScrollPane(table);
		JScrollPane pane = new JScrollPane();
		pane.setViewportView(table);
		
		myFrame.add("Center",pane);
		myFrame.setSize(350,150);
		myFrame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {System.exit(0);}
		});
		myFrame.setVisible(true);
	}
}