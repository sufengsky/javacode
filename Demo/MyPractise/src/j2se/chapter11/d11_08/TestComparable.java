import java.util.TreeSet;
import java.util.Iterator;

public class TestComparable{
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Person(1003,"张三",15));
		ts.add(new Person(1008,"李四",25));
		ts.add(new Person(1015,"王五",73));
		ts.add(new Person(1001,"赵六",49));

		Iterator it = ts.iterator();
		while(it.hasNext()){
			Person employee = (Person)it.next();
			System.out.println(employee);	
		}
	}
}