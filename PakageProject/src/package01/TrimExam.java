package package01;

public class TrimExam {

	public static void main(String[] args) {
		String strData1=" I Love You ";
		String strData2;
		strData2 = strData1.trim(); // ���ڿ��� �յ� ���� ����
									// strData2= "I Love You";�� ����
		System.out.println("strData1.trim() --> "+strData2);
		
		if(strData1.equals(strData2)) System.out.println("����");
		else System.out.println("�ٸ�");
	}

}
