package package02;

public class ToStringExam {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programming");
		String str;
		
		str=sb1.toString();	//sb1�� StringBufferŬ���� Ÿ���� ���ڿ��� ����Ű�µ� 
							//toString()�޼ҵ�� sb1�� ���ڿ��� StringŸ������ ��ȭ�ؼ� str���� �Ѱ��ش�.
		System.out.println("str.toUpperCase() = "+str.toUpperCase());	//str�� ����Ű�� ���ڿ��� �빮�ڷ� �����ؼ� ���
																		//str�� ����Ű�� ���ڿ� ��ü�� ��������� �ʴ´�.
		System.out.println("str = "+str);
	}

}
