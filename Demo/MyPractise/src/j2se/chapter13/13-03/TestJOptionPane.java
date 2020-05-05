import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestJOptionPane implements ActionListener{
	private JFrame jf = new JFrame("��׼�Ի������");
	
	public static void main(String[] args){
		new TestJOptionPane().createUI();
	}
	public void createUI(){
		JToolBar jtb = new JToolBar();
		
		String[] s = {"����","�˳�ȷ��1","�˳�ȷ��2","����","����","ѡ��"};
		int size = s.length;
		JButton[] button = new JButton[size]; 
		for(int i=0;i<size;i++){
			button[i] = new JButton(s[i]);	
			button[i].addActionListener(this);
			jtb.add(button[i]);	
		}
		jf.add(jtb,"North");
		jf.setSize(350,150);
		jf.setLocation(400,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		String s = e.getActionCommand();
		if(s.equals("����")){
			JOptionPane.showMessageDialog(null, "Ҫ��ʾ�Ĵ�����Ϣ---",
			"������ʾ", JOptionPane.ERROR_MESSAGE);	
		}else if(s.equals("�˳�ȷ��1")){
			int result = JOptionPane.showConfirmDialog(null, 
				"�����Ҫ�˳�������?", "��ȷ��", JOptionPane.YES_NO_OPTION);		
			if(result == JOptionPane.OK_OPTION){
				System.exit(0);	
			}
		}else if(s.equals("�˳�ȷ��2")){
			int result = JOptionPane.showConfirmDialog(null, 
				"�˳�ǰ�Ƿ񱣴����?");		
			if(result == JOptionPane.YES_OPTION){
				System.out.println("�������---");
				System.exit(0);	
			}else if(result == JOptionPane.NO_OPTION){
				System.exit(0);	
			}
		}else if(s.equals("����")){
			Object[] options = { "����", "����" };
			int result = JOptionPane.showOptionDialog(null, 
				"���������ܵ������ݶ�ʧ", "Warning", JOptionPane.DEFAULT_OPTION, 
				JOptionPane.WARNING_MESSAGE,null, options, options[0]);
			if(result == 0){
				System.out.println("��������---");
			}
		}else if(s.equals("����")){
			String name = JOptionPane.showInputDialog("����������������");
			if(name != null){	
				System.out.println("������" + name);
			}	
		}else if(s.equals("ѡ��")){
			Object[] possibleValues = { "����", "����", "����","�Ļ�" };
			Object selectedValue = JOptionPane.showInputDialog(null, 
				"Choose one", "Input",JOptionPane.INFORMATION_MESSAGE, null,
				possibleValues, possibleValues[0]);
			String result = (String)selectedValue;
			if(result != null){
				System.out.println("��ѡ����ǣ�" + result);
			}
		}		
	}
}