class Stack{
	int idx=0;
	char[ ] data = new char[6];
	public void push(char c){
		data[idx] = c;
		System.out.print("压入字符" + c + "->");  //p1
		idx++;
		System.out.println("->压入" + c + "操作完成！");		
	}
	public char pop(){
		idx--;
		return data[idx];
	}
}