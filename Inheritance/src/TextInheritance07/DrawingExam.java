package TextInheritance07;

public class DrawingExam {
	public static void main(String[] args){
		Circle c = new Circle();
		c.draw(); //CircleŬ������ �ִ� draw() ȣ��
		c.painting(); //CircleŬ������ �ִ� painting() ȣ��
		Shape s= new Shape();
		s.draw(); //ShapeŬ������ �ִ� draw() ȣ��
		//s.painting(); //�����߻�
		s=c;//Upcasting
		s.draw(); // CircleŬ������ �ִ� draw()�޼ҵ尡 ȣ��
		//s.painting(); //painting()�޼ҵ�� �������� �޼ҵ尡 �ƴϱ� ������ ���� �Ұ�
	}
}
