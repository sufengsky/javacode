package j2se.chapter19.d19_03.v2;

import java.awt.Color;
import java.util.ListResourceBundle;

public class MyLabels_zh_CN extends ListResourceBundle{
	public Object[][] getContents(){
		return  contents;
	}
	private static final Object[][] contents = {
		{"title","我的国际化程序"},
		{"menu.file","文件"},
		{"menu.edit","编辑"},
		{"menu.help","帮助"},
		{"currentEnv","当前用户环境: "},
		{"bgColor",Color.BLUE}
	}; 
}
