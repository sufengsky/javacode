/**
这是一个用于测试目的的Java类，
学习永远不晚！
*/
public class TestComments{	
	/*
		第二种形式的注释，
		将来不会被提取。
	*/
	private int age;		//年龄
	/**
		本方法的功能是设定/修改年龄属性为指定值。
	*/
	public void setAge(int i){
		if(i>=0){//判断条件符合才进行赋值操作
			age = i;
		}		
	}
}

