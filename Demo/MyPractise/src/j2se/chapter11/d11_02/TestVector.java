import java.util.Date;
import java.util.Vector;

public class TestVector{
	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("1st");
		v.add("2nd");
		v.add(new Integer(3));
		v.add(new Double(4.0));
		v.add("2nd");      // 重复元素, 加入
		v.add(new Integer(3)); // 重复元素,加入
		System.out.println(v);		
		System.out.println("size=" + v.size());
		System.out.println("-----替换指定元素-----");	
		v.set(3,"replace");		
		System.out.println("-----for循环遍历-----");
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}		
		System.out.println("-----取用特定元素-----");		
		Integer it = (Integer)v.get(2);
		System.out.println(it.intValue());
		System.out.println("-----插入元素-----");		
		v.add(3,new Date());
		System.out.println("-----转换为数组-----");	
		Object[] os = v.toArray();
		for(Object o : os){
			System.out.println(o);	
		}		
	}
}