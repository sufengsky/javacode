public class TestContinueOuter{
	public static void main(String args[]){
		int n = 0;
		outer:
		for(int i=101;i<200;i+=2){   	   //外层循环
			for(int j=2; j<i;j++){         //内层循环
				if(i%j==0)
					continue outer;   	   //不能使用 "break" ,为什么？
			}
			
			System.out.print(i + "\t");
			n++;                 
			if(n<6 )
				continue;
			System.out.println(); 	   	   //输出六个数据后换行
			n = 0;  
		}
	}
}
