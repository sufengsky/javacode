interface D{
	int age = 5;
}
interface E{
	int age = 6;
}
class F implements D,E{
	public static void main(String args[]){
		System.out.println(D.age);
		System.out.println(E.age);
		//System.out.println(F.age);	   //�������,��age�����ò���ȷ	
	}
}
