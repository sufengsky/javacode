public class TestContinueOuter{
	public static void main(String args[]){
		int n = 0;
		outer:
		for(int i=101;i<200;i+=2){   	   //���ѭ��
			for(int j=2; j<i;j++){         //�ڲ�ѭ��
				if(i%j==0)
					continue outer;   	   //����ʹ�� "break" ,Ϊʲô��
			}
			
			System.out.print(i + "\t");
			n++;                 
			if(n<6 )
				continue;
			System.out.println(); 	   	   //����������ݺ���
			n = 0;  
		}
	}
}
