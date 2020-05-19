import java.util.Date;
import java.util.Locale;
import java.text.MessageFormat;
import java.util.Scanner;

public class TestPlaceholder{
	private static int num = 10000;
	public static void main(String args[]){	
		TestPlaceholder tmf = new TestPlaceholder();
		System.out.print("请输入您的姓名:");
		String userName = new Scanner(System.in).next();
		System.out.println(tmf.formatMsg(userName));
	}
	public String formatMsg(String name){	
		String msg = "{0},您好! 您是第{1}位访客,今天是{2,date,medium},当前时间{2,time,short}";
		Locale locale = Locale.getDefault();
		MessageFormat mf = new MessageFormat(msg,locale);
		Object[] msgArgs = {name,++num,new Date()};
		return mf.format(msgArgs);		
	}
}

