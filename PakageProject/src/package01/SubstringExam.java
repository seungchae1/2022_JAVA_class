package package01;

public class SubstringExam {

	public static void main(String[] args) {
		String strData1="I Love You";
		String strData3;
		
		strData3=strData1.substring(7);	//7��° ����(Y)���� �������� ���ڿ��� ��ȯ
		System.out.println("strData1.substring(7) --> "+strData3);
		strData3 = strData1.substring(2, 5); //2��° ����(L)���� 5-1(v)��° ���ڱ����� ���ڿ��� ��ȯ
		System.out.println("strData1.substring(2,5) --> "+strData3);
	}

}
