import java.awt.*;
import java.awt.event.*;
public class TestChoice implements ItemListener,ActionListener{
	TextField name;
	CheckboxGroup cg;
	Choice career;
	List city;
	Checkbox[] favorite;
	public static void main( String args[]) {
		new TestChoice().createUI();
	}
	
	public void createUI(){
		Frame f = new Frame("ע�ᴰ��");
		Panel p = new Panel();
		p.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
		
		name = new TextField(10);
		cg = new CheckboxGroup();
		Checkbox sex1 = new Checkbox("��",cg,false);
		Checkbox sex2 = new Checkbox("Ů",cg,false);
		Panel sp = new Panel();
		sp.add(sex1);
		sp.add(sex2);
		career = new Choice();
		career.add("IT������Ա");
		career.add("���̹���");
		career.add("����");
		career.add("����");
		city = new List(4,false);
		city.add("����");
		city.add("�Ϻ�");
		city.add("���");
		city.add("����");
		city.add("̫ԭ");
		city.add("ʯ��ׯ");
		city.add("������");
		city.add("����");
		city.add("����");
		
		p.add(new Label("����:"));
		p.add(name);
		p.add(new Label("�Ա�:"));
		p.add(sp);
		p.add(new Label("ְҵ:"));
		p.add(career);
		p.add(new Label("����:"));
		p.add(city);
		p.add(new Label("����:"));

		String[] sf = {"����","����","ʱװ","����","����"};
		favorite = new Checkbox[sf.length];
		for(int i=0;i<sf.length;i++){
			favorite[i] = new Checkbox(sf[i]);
			favorite[i].addItemListener(this);
			p.add(favorite[i]);	
		}
		f.add(p,"Center");

		Panel psouth = new Panel();
		psouth.setLayout(new GridLayout(1,2));
		Button submit = new Button("�ύ");
		Button reset = new Button("�˳�");		
		submit.addActionListener(this);
		reset.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);	
			}
		});
		psouth.add(submit);
		psouth.add(reset);
		f.add(psouth,"South");
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);	
			}	
		});  
		f.setSize(160,270);
		f.setLocation(300,100);
		f.setVisible( true);
	}
	
	public void itemStateChanged(ItemEvent e){
		String s = e.getItem().toString();
		if(e.getStateChange() == ItemEvent.SELECTED){
			System.out.println("����ѡ������Ŀ��" + s);	
		}else{
			System.out.println("����ȡ������Ŀ��" + s);	
		}		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("�ύ")){
			String info = "���ύ����Ϣ���£�\n����:" + name.getText() + 
				"\n�Ա�:" + cg.getSelectedCheckbox().getLabel() + 
				"\nְҵ:" + career.getSelectedItem() + 	
				"\n����:" + city.getSelectedItem() + 	
				"\n����:" ;
			for(Checkbox f:favorite){
				info += f.getState()?(f.getLabel() + ". "):"";	
			}
			System.out.println(info);		 	
		}
	}
}