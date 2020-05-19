import java.util.Date;
import java.util.Stack;

public class TestStack{
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("hello");
		s.push(new Date());
		s.push(400);  //自动封装,等价于s.push(new Integer(400));
		s.push(3.14);
		
		System.out.println("弹栈前:size=" + s.size());
		System.out.println(s.pop());
		System.out.println("弹栈后:size=" + s.size());
		System.out.println(s.peek());
		System.out.println("peek操作后:size=" + s.size());
		while(!s.isEmpty())
			System.out.println(s.pop());
	}
}