public class TestEnumInSwitch{
	public static void main(String[] args){
		TestEnumInSwitch teis = new TestEnumInSwitch();
		teis.work(Week.FRI);
	}	
	public void work(Week day){
		switch(day){
			case MON:
			case TUE:
			case WED:
			case THU:
			case FRI:
				System.out.println("�����գ�ȥ�ϰ�!");	
				break;
			case SAT:
				System.out.println("��������ȥ����!");	
				break;
			case SUN:
				System.out.println("����죬ȥ����!");	
				break;
			default:
				System.out.println("����û�и��!");	
				break;
		}
	}	
}