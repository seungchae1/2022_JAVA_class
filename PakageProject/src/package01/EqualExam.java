package package01;

public class EqualExam {

	public static void main(String[] args) {
		String str1= "mirim";
		String str2= "mirim";
		String str3= new String("meister");
		String str4= new String("meister");
		
		if(str1==str2) System.out.println("�ּҰ���"); //ture
		else System.out.println("�ּ� �ٸ���");			//�ּҰ��� ���Ѵ�.
		
		if(str3==str4) System.out.println("�ּҰ���");
		else System.out.println("�ּ� �ٸ���");			//new�� ���� false
		
		if(str1.equals(str2)) System.out.println("���배��");	//���� ��	
		else System.out.println("���� �ٸ���");					//str1�� ����Ű�� ������ str2�� ����Ű�� ����� ������ ��
		
		if(str3.equals(str4)) System.out.println("���배��");
		else System.out.println("���� �ٸ���");
	}

}
