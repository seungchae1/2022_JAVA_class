package package01;

public class ValueOfExam {

	public static void main(String[] args) {
		char ch='A';			//����
		String strData1="A";	//���ڿ�
		String strData2;
		strData2 = String.valueOf(ch);	//ch�� ����Ǿ��ִ� ���ڸ� ���ڿ��� ��ȯ
		
		if(strData1.equals(strData2)) System.out.println("����");
		else System.out.println("�ٸ�");
	}

}
