import java.io.*;
public class TestCharArrayReader{
	public static void main(String[] args){
		char[] b = {'I',' ','a','m',' ','S','a','i','l','i','n','g','!'};
		CharArrayReader car = new CharArrayReader(b);
		MyReader mr = new MyReader();
		mr.getInfo(car);	
	}	
}