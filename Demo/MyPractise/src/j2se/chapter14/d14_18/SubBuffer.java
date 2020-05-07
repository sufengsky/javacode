import java.nio.*;

public class SubBuffer {
	public static void main(String[] args){
		CharBuffer cb = CharBuffer.allocate(14);
		cb.put("abcdefghijklmn");
		cb.position(3);
		cb.limit(6);
		CharBuffer scb = cb.slice();
		
		for(int i=0;i<scb.capacity();i++){
			char c = scb.get(i);
			System.out.print(c);
			scb.put(i,String.valueOf(c).toUpperCase().charAt(0)); 	
		}
		
		System.out.println();
		cb.position(0);
		cb.limit(cb.capacity());
		while(cb.remaining() > 0){
			System.out.print(cb.get());
		}
	}
}