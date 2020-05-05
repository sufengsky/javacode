import java.util.Date;
import java.util.Locale;
import java.text.MessageFormat;
import java.util.Scanner;

public class TestMessageFormat{
	private static int num = 10000;
	public static void main(String args[]){	
		TestMessageFormat tmf = new TestMessageFormat();
		System.out.print("��������������:");
		String userName = new Scanner(System.in).next();
		System.out.println(tmf.formatMsg(userName));
	}
	public String formatMsg(String name){	
		String msg = "{0},��ӭ��! ���ǵ�{2}λ�ÿ�,��ǰʱ����{1}";
		Object[] msgArgs = {name,new Date(),++num};
		return MessageFormat.format(msg,msgArgs);		
	}
}

