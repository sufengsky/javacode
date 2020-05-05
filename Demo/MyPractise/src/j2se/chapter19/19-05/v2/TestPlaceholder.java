import java.util.Date;
import java.util.Locale;
import java.text.MessageFormat;
import java.util.Scanner;
import java.text.DateFormat;

public class TestPlaceholder{
	private static int num = 10000;
	public static void main(String args[]){	
		TestPlaceholder tmf = new TestPlaceholder();
		System.out.print("��������������:");
		String userName = new Scanner(System.in).next();
		System.out.println(tmf.formatMsg(userName));
	}
	public String formatMsg(String name){	
		String msg = "{0},����! ���ǵ�{1}λ�ÿ�,������{2},��ǰʱ��{2}";
		Locale locale = Locale.getDefault();
		MessageFormat mf = new MessageFormat(msg,locale);
		mf.setFormat(2,DateFormat.getDateInstance(DateFormat.MEDIUM));
		mf.setFormat(3,DateFormat.getTimeInstance(DateFormat.SHORT));
		Object[] msgArgs = {name,++num,new Date()};
		return mf.format(msgArgs);		
	}
}

