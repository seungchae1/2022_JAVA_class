package thread01;

public class Thread1Exam {
	public static void main(String args[]) { //main �����尡 ����
		System.out.println("���α׷� ����");
		Top d = new Top();
		d.start(); //Top Ŭ������ run()�޼ҵ尡 ����
		System.out.println("���α׷� ����");
		//main������� Top�� run()�޼ҵ�� ���ÿ� �����
		//main�����尡 ����Ǿ TopŬ������ run()�޼ҵ�� ������
	}
}
