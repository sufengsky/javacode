package sxtdemo.Demo02oop;

public class Dog {
	static int furColor;
	float height;
	float weight;
	
	void catchMouse(Mouse m) {
		//as;dfj;asdf
		//asdfj;asf
		//m.scream();
	}
	
	public static void main(String[] args) {
		//int i;
		System.out.println(furColor);
		Dog d = new Dog();
		Mouse m = new Mouse();
		d.catchMouse(m);
	}
}

class Mouse {
	int height;
}