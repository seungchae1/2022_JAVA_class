package thread02;

public class Thread2Exam {
	public static void main(String args[]) {
		// ���� ������ ����
		System.out.println("���α׷� ����");
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		
		d1.start();	//DerivedThreadŬ������ �ִ� run()�޼ҵ� ����
		d2.start();	//DerivedThreadŬ������ �ִ� run()�޼ҵ� ����
		
		System.out.println("���α׷� ����");
	}
}
