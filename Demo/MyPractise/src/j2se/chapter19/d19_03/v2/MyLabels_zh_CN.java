import java.awt.Color;
import java.util.ListResourceBundle;

public class MyLabels_zh_CN extends ListResourceBundle{
	public Object[][] getContents(){
		return  contents;
	}
	private static final Object[][] contents = {
		{"title","�ҵĹ��ʻ�����"},
		{"menu.file","�ļ�"},
		{"menu.edit","�༭"},
		{"menu.help","����"},
		{"currentEnv","��ǰ�û�����: "},
		{"bgColor",Color.BLUE}
	}; 
}
