import java.awt.Frame;
import java.awt.Panel;
import java.awt.Color;

public class TestFrameWithPanel{
	public static void main(String args[]) {
		Frame f = new Frame("MyTest");
		Panel pan = new Panel();
		f.setSize(200,170);
		f.setBackground(Color.cyan);
		f.setLayout(null); // ȡ��Ĭ�ϲ��ֹ�����
		pan.setSize(80,80);
		pan.setBackground(Color.green);
		f.add(pan);
		pan.setLocation(40,40);
		f.setLocation(300,300);
		f.setVisible(true);
	}
}
