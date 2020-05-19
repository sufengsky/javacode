import java.awt.Color;
import java.util.ListResourceBundle;
public class MyLabels_zh_CN extends ListResourceBundle
{
	//定义资源
	private final Object my_data[][]=
	{
		{"title","我的国际化程序"},
		{"menu.file","文件"}	,
		{"menu.edit","编辑"},
		{"menu.help","帮助"},
		{"currentEnv","当前用户环境: "},
		{"bgColor",Color.BLUE}
	};
	//实现抽象方法getContents()
	public Object[][] getContents()
	{
		return my_data;
	}	
}
