import java.util.*;
import java.text.*;

public class Test{
	private static int num = 10000;
	public static void main(String args[]){
		Locale defaultLocale = Locale.getDefault();
		ResourceBundle bundle = ResourceBundle.getBundle("MyMsgs",defaultLocale);
		String note = bundle.getString("note");	
		String msg = bundle.getString("msg");	
		System.out.print(note);
		String userName = new Scanner(System.in).next();
		
		MessageFormat mf = new MessageFormat(msg,defaultLocale);
		Object[] msgArgs = {userName,++num,new Date()};
		System.out.println(mf.format(msgArgs));		
	}
}