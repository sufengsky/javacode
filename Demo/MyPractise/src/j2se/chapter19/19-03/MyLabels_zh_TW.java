import java.awt.Color;
import java.util.ListResourceBundle;
public class MyLabels_zh_TW extends ListResourceBundle
{
	//定義資源
	private final Object my_data[][]=
	{
		{"title","我的國際化程式"},
		{"menu.file","文檔"}	,
		{"menu.edit","編輯"},
		{"menu.help","幫助"},
		{"currentEnv","當前用戶環境: "},
		{"bgColor",Color.BLUE}
	};
	//實現抽象方法getContents()
	public Object[][] getContents()
	{
		return my_data;
	}	
}
