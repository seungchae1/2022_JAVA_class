package TextInheritance09;

public class ShapeCalculator extends ShapeExam{
	// ShpeExam���� �߻�޼ҵ�� ����� ��� ���� ���⼭ �����ؾ� �Ѵ�
	@Override
	public double geArea(int a) { //������ �ݵ�� �ʿ�
		return 3.14 * a * a;
	}
	
	@Override
	public double getCircum(int a) {
		return 2 * 3.14 * a;
	}
}
