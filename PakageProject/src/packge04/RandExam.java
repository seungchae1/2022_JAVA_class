package packge04;

public class RandExam {

	public static void main(String[] args) {
		System.out.println(Math.random()); 	//0 < ��Ǽ� < 1
		System.out.println(Math.random());	//������(0.xxxx...)�� ���� int������ �ٲٰ�(0) 5�� ���� => ��� �׻� 0
		System.out.println((int)Math.random()*5);
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*100));
	}

}
