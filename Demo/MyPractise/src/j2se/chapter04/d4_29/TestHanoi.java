public class TestHanoi{
	private int times = 0;
	public static void main(String args[]){
		TestHanoi t = new TestHanoi();
		t.hanoi(3,'A','B','C');
	}

	public void hanoi(int n,char a,char b,char c){
		//n: 待搬运的盘子总数
		//a:   源塔   b: 辅助塔		c:目标塔 
		//如果n==1,则直接搬运
		if(n==1){
			times++;
			System.out.println(times + ":\t" + "将p1从 " + a + " 搬到 " + c);
		}else{
			//如果n>1,则分解成几步来处理
			//step1:将n-1个盘子从a搬到b,借助于c
			this.hanoi(n-1,a,c,b);		
			//step2:将第n个盘子从a搬到c
			times ++;
			System.out.println(times + ":\t" + "将p" + n + "从 " + a + " 搬到 " + c);
			//step3:将n-1个盘子从b搬到c,借助于a
			this.hanoi(n-1,b,a,c);
		}
	}
}