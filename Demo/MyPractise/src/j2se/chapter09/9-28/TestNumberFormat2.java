import java.util.Locale;
import java.text.NumberFormat;

public class TestNumberFormat2{
	public static void main(String args[]){
		double d = 1234.56;	
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(new Locale("zh","CN"));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en","US"));
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("zh","HK"));		
		System.out.println("�й�����:" + nf1.format(d));
		System.out.println("��������:" + nf2.format(d));
		System.out.println("��ۻ���:" + nf3.format(d));
		
		NumberFormat nf4 = NumberFormat.getPercentInstance();
		System.out.println(nf4.format(0.7483));
	}	
}