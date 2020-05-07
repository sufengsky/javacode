import java.awt.Color;
import java.util.ListResourceBundle;
public class MyMsgs extends ListResourceBundle {
	private final Object my_data[][] = {
		{"note","Please input your name: "},
		{"msg","Welcome,{0}! Your seriation no is {1},Date: {2,date,medium},  Time:{2,time,short}"}
	};
	public Object[][] getContents() {
		return my_data;
	}	
}
