package Inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		//super(); //���� Ŭ������ �⺻ �����ڸ� ����
		super(x, y); //�� �޼ҵ忡�� �ݵ�� ó�� ��ġ�� �־�� �� //���� Ŭ������ �Ű����� 2���� ���� �����ڸ� ȣ��
		//super(); //�ߺ��ؼ� super()�޼ҵ� ���Ұ�
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}