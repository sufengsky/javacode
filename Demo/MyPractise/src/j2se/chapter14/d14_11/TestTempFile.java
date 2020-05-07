import java.io.*;
import java.awt.event.*;
import javax.swing.*;

public class TestTempFile implements ActionListener{
	private File tempPath;
	public static void main(String args[]){
		TestTempFile ttf = new TestTempFile();
		ttf.init();
		ttf.createUI();
	}
	
	public void createUI(){
		JFrame frame = new JFrame();
		JButton jb = new JButton("������ʱ�ļ�");
		jb.addActionListener(this);
		frame.add(jb,"North");	
		frame.setSize(200,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void init(){
		tempPath = new File("temp");
		if(!tempPath.exists() || !tempPath.isDirectory()){
			tempPath.mkdir();  //��������ڣ��򴴽����ļ���
		}
	}
	public void actionPerformed(ActionEvent e){
		try	{
			//��tempPath·���´�����ʱ�ļ�"mytempfileXXXX.tmp"
			//XXXX ��ϵͳ�Զ������������, tempPath��Ӧ��·��Ӧ���ȴ���
			File tempFile=File.createTempFile("mytempfile",".txt",null);
			System.out.println(tempFile.getAbsolutePath());
						
			FileWriter fout=new FileWriter(tempFile);
			PrintWriter out=new PrintWriter(fout);
			out.println("some info!" );
			out.close(); //ע�⣺���޴˹ر���䣬�ļ�������ɾ��
			
			//tempFile.delete(); 
			tempFile.deleteOnExit();
		}
		catch(IOException e1){
			System.out.println(e1);
		}
	}
}

