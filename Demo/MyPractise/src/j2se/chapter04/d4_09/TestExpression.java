public class TestExpression{
	public static void main(String args[]){
		int i,j,k;
		i = j = k = 5 + 3;   	//等价于 i = (j = (k = 5));
		System.out.println(i + "\t" + j + "\t" + k); 
		
		boolean b = false;
		if(b = true)			//注意，这里只有一个"="号
			System.out.println("ok!");
		else
			System.out.println("error!");
					  
		A a = new A();
		a.ma(); 	//合法		
		//System.out.println(a.ma());     //非法
		//int result = a.ma();			//非法 
	}		
}

class A{
	public void ma(){
		System.out.println("In method ma()!");	
	}	
}
