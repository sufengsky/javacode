import java.util.Date;
import java.util.Locale;
import java.text.MessageFormat;
import java.util.Scanner;

public class TestMessageFormat{
	private static int num = 10000;
	public static void main(String args[]){	
		TestMessageFormat tmf = new TestMessageFormat();
		System.out.print("请输入您的姓名:");
		String userName = new Scanner(System.in).next();
		System.out.println(tmf.formatMsg(userName));
	}
	public String formatMsg(String name){	
		String msg = "{0},欢迎您! 您是第{2}位访客,当前时间是{1}";
		Locale locale = Locale.getDefault();
		MessageFormat mf = new MessageFormat(msg,locale);
		Object[] msgArgs = {name,new Date(),++num};
		return mf.format(msgArgs);		
	}
}

