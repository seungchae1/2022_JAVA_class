package TextInheritance04;

public class CircleMainTest extends CircleArea_Exam{

	public static void main(String[] args) {
		CircleArea_Exam cp = new CircleArea_Exam();
		// System.out.println("���� ������ "+cp.area(10));
		// area()�޼ҵ�� ���������ڰ� private�� �����Ǿ��־ ���� Ŭ�������� ���� �Ұ� 
		
		System.out.println("���� �ѷ��� "+cp.round(10));
		// round()�޼Ҵ� protected�� �����Ǿ ���� ��Ű���� ������ ���� ����
		// �ٸ� ��Ű���� �ִ��� ��Ӱ����� ���� ����
	}

}
