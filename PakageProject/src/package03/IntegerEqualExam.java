package package03;

public class IntegerEqualExam {

	public static void main(String[] args) {
		Integer in1= new Integer(100);								//�ּҰ��� stack������ ����ǰ�, ����Ű�� ���� heap������ ����ȴ�.
		Integer in2= new Integer(100);
		Integer in3= new Integer(200);
		
		int a=300, b=400;
		
		System.out.println("in1.equals(in2) ==> "+in1.equals(in2));	//in1�� in2�� ����Ű�� ���� ���ؼ� ������ true, �ٸ��� false�� ��ȯ
		System.out.println("in1.equals(in3) ==> "+in1.equals(in3));
		//System.out.println("a.equals(b) ==> "+a.equals(b));		//�����߻� 		//equals()�� ��üŸ���� ���ϴ� �޼ҵ�
		
		in1=a;
		in2=300;
		System.out.println("in1.equals(in2) ==> "+in1.equals(in2));
	}
	//WrapperŬ������ ����ϴ� ����
	//1. java.util��Ű���� Ŭ�������� ��ü �����͸� ó��
	//2. ArrayList, Collection ������ ��ũ�� ������ ��ü Ÿ�Ը� ����(�ڷᱸ��)
	//3. ��Ƽ�����忡�� ����ȭ�� �����Ϸ��� 

}
