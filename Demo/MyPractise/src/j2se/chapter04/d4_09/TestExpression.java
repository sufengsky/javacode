public class TestExpression{
	public static void main(String args[]){
		int i,j,k;
		i = j = k = 5 + 3;   	//�ȼ��� i = (j = (k = 5));
		System.out.println(i + "\t" + j + "\t" + k); 
		
		boolean b = false;
		if(b = true)			//ע�⣬����ֻ��һ��"="��
			System.out.println("ok!");
		else
			System.out.println("error!");
					  
		A a = new A();
		a.ma(); 	//�Ϸ�		
		//System.out.println(a.ma());     //�Ƿ�
		//int result = a.ma();			//�Ƿ� 
	}		
}

class A{
	public void ma(){
		System.out.println("In method ma()!");	
	}	
}
