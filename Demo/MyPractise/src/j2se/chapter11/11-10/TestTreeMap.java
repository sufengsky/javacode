import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;

public class TestTreeMap{
	public static void main(String[] args) {
		TreeMap hm = new TreeMap();
		hm.put(new MyKey(1003),new Person("Tom",15));
		hm.put(new MyKey(1008),new Person("Billy",25));
		hm.put(new MyKey(1005),new Person("Kity",73));   
		hm.put(new MyKey(1001),new Person("Nancy",49));

		System.out.println("----检索单个元素----");
		Person p = (Person)hm.get(new MyKey(1008));
		System.out.println(p);
		
		System.out.println("----遍历所有元素----");
		Set names = hm.keySet();
		Iterator it = names.iterator();
		while(it.hasNext()){
			MyKey key = (MyKey)it.next();
			Person value = (Person)hm.get(key); 
			System.out.println(key.getId() + "\t" + value);
		}
	}
}