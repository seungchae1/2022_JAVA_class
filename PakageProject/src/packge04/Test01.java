package packge04;

public class Test01 {

	public static void main(String[] args) {
		//�ֻ����� ���� ����ϴµ� 20�� ������ 
		//���� * 500���� ��������.
		//��ü �ݾ���?
		int dice, money=0;
		for(int i=1; i<=20; i++) {
			dice=(int)(Math.random()*6+1);
			money+=500*dice;
			System.out.println(dice+"�� ���� "+500*dice+"���� ����.(���� �ݾ� : "+money+")");
		}
		System.out.println("�� �ݾ��� : "+money);

	}

}
