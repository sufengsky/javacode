import java.math.BigInteger;
public class TestBigInteger{
	public static void main(String args[]){
		BigInteger a = BigInteger.valueOf(43);
		BigInteger b = new BigInteger("12345678901234560000");
		//Long c = new Long(12345678901234560000L);	//³¬³ö·¶Î§
		BigInteger c = a.add(b);
		System.out.println(c);
		System.out.println(a.multiply(b.subtract(BigInteger.valueOf(120))));
		System.out.println(b.remainder(a));
		System.out.println(b.divide(a));
		System.out.println(b.pow(2));
		System.out.println(b.compareTo(a));
	}	
}