package thread03;

public class Runnable2Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		//1. Runnable�� �����ϴ� ��ü �����
		Top t = new Top();	
		
		//2. Runnable�� ������ �Ŀ� ��¥ ������ �����
		Thread thd1 = new Thread(t);
		Thread thd2 = new Thread(t);
		
		//3. ������ �����ϱ�
		thd1.start();
		thd2.start();

		System.out.println("���α׷� ����");
	}

}
