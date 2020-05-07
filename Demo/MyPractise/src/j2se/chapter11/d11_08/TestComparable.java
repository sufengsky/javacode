import java.util.TreeSet;
import java.util.Iterator;

public class TestComparable{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Person(1003,"����",15));
		ts.add(new Person(1008,"����",25));
		ts.add(new Person(1015,"����",73));
		ts.add(new Person(1001,"����",49));

		Iterator it = ts.iterator();
		while(it.hasNext()){
			Person employee = (Person)it.next();
			System.out.println(employee);	
		}
	}
}