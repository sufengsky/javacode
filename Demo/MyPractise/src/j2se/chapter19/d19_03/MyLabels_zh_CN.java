import java.awt.Color;
import java.util.ListResourceBundle;
public class MyLabels_zh_CN extends ListResourceBundle
{
	//������Դ
	private final Object my_data[][]=
	{
		{"title","�ҵĹ��ʻ�����"},
		{"menu.file","�ļ�"}	,
		{"menu.edit","�༭"},
		{"menu.help","����"},
		{"currentEnv","��ǰ�û�����: "},
		{"bgColor",Color.BLUE}
	};
	//ʵ�ֳ��󷽷�getContents()
	public Object[][] getContents()
	{
		return my_data;
	}	
}
