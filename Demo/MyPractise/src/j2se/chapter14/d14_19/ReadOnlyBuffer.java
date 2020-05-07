import java.nio.*;

public class ReadOnlyBuffer {
	public static void main(String[] args){
		CharBuffer cb = CharBuffer.allocate(20);
		cb.put("abcdefg");
		cb.flip();
		CharBuffer readOnly = cb.asReadOnlyBuffer();
		System.out.println(cb.isReadOnly());
		System.out.println(readOnly.isReadOnly());
		cb.put(2,'K');
		//readOnly.put(3,'M');
		new ReadOnlyBuffer().f(readOnly);
	}
	
	public void f(CharBuffer cb){
		while(cb.remaining() > 0){
			System.out.print(cb.get());	
		}
	}
}