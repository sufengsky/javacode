import java.awt.Color;
import java.util.ListResourceBundle;
public class MyLabels_zh_TW extends ListResourceBundle
{
	//���x�YԴ
	private final Object my_data[][]=
	{
		{"title","�ҵć��H����ʽ"},
		{"menu.file","�ęn"}	,
		{"menu.edit","��݋"},
		{"menu.help","����"},
		{"currentEnv","��ǰ�Ñ��h��: "},
		{"bgColor",Color.BLUE}
	};
	//���F���󷽷�getContents()
	public Object[][] getContents()
	{
		return my_data;
	}	
}
