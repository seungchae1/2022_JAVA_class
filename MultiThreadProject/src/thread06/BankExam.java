package thread06;

public class BankExam {
	public static Bank mybank = new Bank();
	public static void main(String[] args) {
		System.out.println("���� : "+mybank.getMoney());
		Family1 f1 = new Family1(); //f1�� ������ ��ü
		Family2 f2 = new Family2(); //f2�� ������ ��ü
		
		f1.start();
		try {
			Thread.sleep(200); //0.2�� ����
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		f2.start();
	}

}
