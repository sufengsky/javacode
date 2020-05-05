import java.util.Date;
import java.util.Vector;
import java.lang.SuppressWarnings;  

@SuppressWarnings({"unchecked"})
public class TestSuppressWarnings{
	public static void main(String args[]){
		Vector v = new Vector();
		v.addElement("Tom");	
		v.addElement("Billy");	
		v.addElement("Nancy");	
		v.addElement(new Date());		
		v.addElement(new Integer(300));	

		for(int i=0;i<v.size();i++){
			Object o = v.elementAt(i);
			System.out.println(o);	
		}
	}	
}