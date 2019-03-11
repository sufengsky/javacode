package basic.demo0014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import basic.demo0014.Person;

public class Main {

	/**
	 * 排序使用的Comparator的使用示例
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// 姓名比较器
		class nCompare implements Comparator<Person> {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}

		// 年龄比较器
		class ageCompare implements Comparator<Person> {

			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getAge() > o2.getAge()) {
					return 1;
				} else if (o1.getAge() == o2.getAge()) {
					return 0;
				} else {
					return -1;
				}
			}

		}

		// 定义一个Person类型的ArrayList
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

		// 使用名字比较器对ArrayList排序
		nCompare nameCompare = new nCompare();
		Collections.sort(family, nameCompare);

		for (Person p : family) {
			System.out.println(p.getName() + ":" + p.getAge());
		}

		// 使用年龄比较器对ArrayList排序
		Collections.sort(family, new ageCompare());

		for (Person p : family) {
			System.out.println(p.getName() + ":" + p.getAge());
		}

	}

}
