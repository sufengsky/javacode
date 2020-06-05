package j2se.chapter19.d19_06;

import java.awt.Color;
import java.util.ListResourceBundle;
public class MyMsgs_zh_CN extends ListResourceBundle {
	private final Object my_data[][] = {
		{"note","请输入您的姓名: "},
		{"msg","{0},您好! 您是第{1}位访客,今天是{2,date,medium},当前时间{2,time,short}"}
	};
	public Object[][] getContents() {
		return my_data;
	}	
}
