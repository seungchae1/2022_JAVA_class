package thread03;

public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Top t = new Top();	//Runnable �������̽��� ������ TopŬ���� ��ü ����
		Thread thd = new Thread(t);	//TopŬ������ ��ü���� ���ڷ� �� Thread thd��ü ����
		thd.start();
		// TopŬ������ �ִ� run()�޼ҵ尡 ����
		System.out.println("���α׷� ����");
	}

}
