import java.util.Hashtable;

public class TestHashtable{
	public static void main(String args[]){
		Hashtable<Integer,Employee> ht = new Hashtable<Integer,Employee>();
		ht.put(101,new Employee(101,"����",5000));
		ht.put(102,new Employee(102,"����",4800));
		ht.put(106,new Employee(106,"����",8620));
		
		Employee e = ht.get(102);
		e.showInfo();
	}	
}