package j2se.chapter19.d19_03;

import java.awt.Color;
import java.util.ListResourceBundle;

public class MyLabels extends ListResourceBundle{
	public Object[][] getContents(){
		return  contents;
	}
	private static final Object[][] contents = {
		{"title","My I18N Program"},
		{"menu.file","File"},
		{"menu.edit","Edit"},
		{"menu.help","Help"},
		{"currentEnv","Current Environment: "},
		{"bgColor",Color.GREEN}
	}; 
}
