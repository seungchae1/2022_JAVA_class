package package01;

public class CharAtExam {

	public static void main(String[] args) {
		String str="I love Korea";
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)); //str�� ����Ű�� ���ڿ��� 0��°���� length()��°���� 1���ھ� ���
											 //i�� ���� 0 ~ length()-1
		}
		System.out.println();
	}

}
