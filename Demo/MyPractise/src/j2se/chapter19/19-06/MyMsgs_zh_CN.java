import java.awt.Color;
import java.util.ListResourceBundle;
public class MyMsgs_zh_CN extends ListResourceBundle {
	private final Object my_data[][] = {
		{"note","��������������: "},
		{"msg","{0},����! ���ǵ�{1}λ�ÿ�,������{2,date,medium},��ǰʱ��{2,time,short}"}
	};
	public Object[][] getContents() {
		return my_data;
	}	
}
