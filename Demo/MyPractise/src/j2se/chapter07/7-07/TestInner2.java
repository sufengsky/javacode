public class TestInner2 {
	public static void main(String[] args) {
		A a = new A();
		// 创建一个依赖于a而存在的b
		A.B b = a.new B();
		b.mb();
	}
}
