package thread04;

public class Runnable3Exam {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		
		Top t = new Top(); // Top Ŭ���� ��ü t ����
		Thread thd1 = new Thread(t, "a"); //������ t ��ü�� �̿��Ͽ� ������ ��ü thd1 ����, ������ �̸��� a�� ����
		Thread thd2 = new Thread(t, "b");
		System.out.println(thd1.getPriority()); //������ ��ü�� �켱������ ���
		System.out.println(thd2.getPriority());	//�켱������ �����尪�� 5�� �Ǿ�����
		thd1.setName("new_a");
		thd2.setName("new_b");
		thd1.setPriority(9);
		thd2.setPriority(thd2.MIN_PRIORITY); //1
		System.out.println(thd1.getPriority());
		System.out.println(thd2.getPriority());
		
		thd1.start(); //new_a�� ��������� �� ���� ���´� (�켱���� 9)
		thd2.start();
		System.out.println("���α׷� ����");
	}
}
