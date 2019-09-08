package basic.demo0013;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	/**
	 * 实现了Comparable接口的类进行排序的演示
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Person> family = new ArrayList<Person>();
		Person son = new Person();
		son.setAge(1);
		son.setName("zixi");
		family.add(son);
		Person daughter = new Person();
		daughter.setAge(1);
		daughter.setName("zihan");
		family.add(daughter);
		Person wife = new Person();
		wife.setAge(33);
		wife.setName("yezhen");
		family.add(wife);
		Person husband = new Person();
		husband.setAge(36);
		husband.setName("sufeng");
		family.add(husband);

		Collections.sort(family);//先对数组进行排序
		Collections.reverse(family);//如果需要逆序的话，就将排序好的数据反转一下就是逆序了

		for (Person p : family) {
			System.out.println(p.getName() + ":" + p.getAge());
		}

	}

}
