public class TestHanoi{
	private int times = 0;
	public static void main(String args[]){
		TestHanoi t = new TestHanoi();
		t.hanoi(3,'A','B','C');
	}

	public void hanoi(int n,char a,char b,char c){
		//n: �����˵���������
		//a:   Դ��   b: ������		c:Ŀ���� 
		//���n==1,��ֱ�Ӱ���
		if(n==1){
			times++;
			System.out.println(times + ":\t" + "��p1�� " + a + " �ᵽ " + c);
		}else{
			//���n>1,��ֽ�ɼ���������
			//step1:��n-1�����Ӵ�a�ᵽb,������c
			this.hanoi(n-1,a,c,b);		
			//step2:����n�����Ӵ�a�ᵽc
			times ++;
			System.out.println(times + ":\t" + "��p" + n + "�� " + a + " �ᵽ " + c);
			//step3:��n-1�����Ӵ�b�ᵽc,������a
			this.hanoi(n-1,b,a,c);
		}
	}
}