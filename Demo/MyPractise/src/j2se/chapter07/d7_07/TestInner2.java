public class TestInner2 {
	public static void main(String[] args) {
		A a = new A();
		// ����һ��������a�����ڵ�b
		A.B b = a.new B();
		b.mb();
	}
}
