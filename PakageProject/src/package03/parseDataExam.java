package package03;

public class parseDataExam {

	public static void main(String[] args) {
		String a ="10", b="20";
		int sum=0;
		float average=0;
		System.out.println("Input data : "+a+" "+b);
		int c=Integer.parseInt(a);	//���ڿ� a�� ���� ���������� ��ȯ, c�� ����
		int d=Integer.parseInt(b);	//���ڿ� b�� ���� ���������� ��ȯ, d�� ����
		sum=c+d;
		average=sum/2;
		System.out.println(a+" "+b+"="+sum);
		System.out.println("��� = "+average);
	}

}
