import java.nio.*;

public class TestCharBuffer {
	
	public static void main(String[] args){
		CharBuffer cb = CharBuffer.allocate(8);
		System.out.println("��ʼ״̬��");		//p1
		TestCharBuffer.showInfo(cb);
		
		cb.put('a');
		cb.put(new char[]{'b','c'});
		cb.put("def");							//p2
		System.out.println("д��6�����ݺ�");	
		TestCharBuffer.showInfo(cb);
		
		cb.flip();								//p3
		System.out.println("flip������");	
		TestCharBuffer.showInfo(cb);
		
		char c = cb.get();						//p4
		System.out.println(c);
		System.out.println("��Զ�ȡһ�����ݺ�");	
		TestCharBuffer.showInfo(cb);
		
		c = cb.get(3);							//p5
		System.out.println(c);
		System.out.println("���Զ�ȡ���ݺ�");	
		TestCharBuffer.showInfo(cb);
		
		cb.clear();								//p6
		System.out.println("clear������");	
		TestCharBuffer.showInfo(cb);
		
		//clear�����󻺳��������ݲ�δ�����		
		System.out.println(cb.get(4));
	}
	
	public static void showInfo(CharBuffer buff){
		System.out.println("capacity:" + buff.capacity() + 
			"\tlimit:" + buff.limit() + 
			"\tposition:" + buff.position());	
	}
}