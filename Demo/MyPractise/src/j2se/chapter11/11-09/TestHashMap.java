import java.util.Set;
import java.util.HashMap;
import java.util.Collection;
import java.util.Iterator;

public class TestHashMap{
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new Integer(1003),new Person(1003,"����",15));
		hm.put(new Integer(1008),new Person(1008,"����",25));
		hm.put(1015,new Person(1015,"����",73));   //�Զ���װ
		hm.put(1001,new Person(1001,"����",49));

		System.out.println("----��������Ԫ��----");
		Person p = (Person)hm.get(1008);
		System.out.println(p);
		
		System.out.println("----��������\"��\"��Ԫ������----");
		Set names = hm.keySet();
		for(Object o : names){
			System.out.println(o);
		}
		
		System.out.println("----��������\"ֵ\"��Ԫ��ֵ��----");
		Collection values = hm.values();
		for(Object o : values){
			System.out.println(o);
		}
	}
}