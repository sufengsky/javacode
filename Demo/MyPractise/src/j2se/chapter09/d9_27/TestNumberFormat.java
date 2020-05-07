import java.util.Locale;
import java.text.NumberFormat;

public class TestNumberFormat{
	public static void main(String args[]){
		double d = 1234.56;
	
		NumberFormat nf0 = NumberFormat.getInstance();
		NumberFormat nf1 = NumberFormat.getInstance(new Locale("zh","CN"));
		NumberFormat nf2 = NumberFormat.getInstance(new Locale("de","CH"));
		NumberFormat nf3 = NumberFormat.getInstance(new Locale("de","GE"));
		
		System.out.println("Ĭ�Ϸ��:" + nf0.format(d));
		System.out.println("�й����:" + nf1.format(d));
		System.out.println("��ʿ���:" + nf2.format(d));
		System.out.println("�¹����:" + nf3.format(d));
	}	
}