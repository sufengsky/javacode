import java.util.Hashtable;
import java.util.Enumeration;

public class TestEnumeration{
	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		ht.put(new Integer(1003),new Person(1003,"张三",15));
		ht.put(new Integer(1008),new Person(1008,"李四",25));
		ht.put(1015,new Person(1015,"王五",73));   
		ht.put(1001,new Person(1001,"赵六",49));

		Enumeration keys = ht.keys();
		while(keys.hasMoreElements()){
			Integer key = (Integer)keys.nextElement(); 
			Person p = (Person)ht.get(key);
			System.out.println("Key: " + key + "\t" + p);
		}
	}
}