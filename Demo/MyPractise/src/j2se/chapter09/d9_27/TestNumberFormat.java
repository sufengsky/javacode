import java.util.Locale;
import java.text.NumberFormat;

public class TestNumberFormat{
	public static void main(String args[]){
		double d = 1234.56;
	
		NumberFormat nf0 = NumberFormat.getInstance();
		NumberFormat nf1 = NumberFormat.getInstance(new Locale("zh","CN"));
		NumberFormat nf2 = NumberFormat.getInstance(new Locale("de","CH"));
		NumberFormat nf3 = NumberFormat.getInstance(new Locale("de","GE"));
		
		System.out.println("默认风格:" + nf0.format(d));
		System.out.println("中国风格:" + nf1.format(d));
		System.out.println("瑞士风格:" + nf2.format(d));
		System.out.println("德国风格:" + nf3.format(d));
	}	
}