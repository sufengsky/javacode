package j2se.chapter14.d14_14;

import java.nio.*;

public class TestCharBuffer {
	
	public static void main(String[] args){
		CharBuffer cb = CharBuffer.allocate(8);
		System.out.println("初始状态：");		//p1
		TestCharBuffer.showInfo(cb);
		
		cb.put('a');
		cb.put(new char[]{'b','c'});
		cb.put("def");							//p2
		System.out.println("写入6个数据后：");	
		TestCharBuffer.showInfo(cb);
		
		cb.flip();								//p3
		System.out.println("flip操作后：");	
		TestCharBuffer.showInfo(cb);
		
		char c = cb.get();						//p4
		System.out.println(c);
		System.out.println("相对读取一个数据后：");	
		TestCharBuffer.showInfo(cb);
		
		c = cb.get(3);							//p5
		System.out.println(c);
		System.out.println("绝对读取数据后：");	
		TestCharBuffer.showInfo(cb);
		
		cb.clear();								//p6
		System.out.println("clear操作后：");	
		TestCharBuffer.showInfo(cb);
		
		//clear操作后缓冲区中内容并未被清除		
		System.out.println(cb.get(4));
	}
	
	public static void showInfo(CharBuffer buff){
		System.out.println("capacity:" + buff.capacity() + 
			"\tlimit:" + buff.limit() + 
			"\tposition:" + buff.position());	
	}
}