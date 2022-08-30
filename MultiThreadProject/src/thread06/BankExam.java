package thread06;

public class BankExam {
	public static Bank mybank = new Bank();
	public static void main(String[] args) {
		System.out.println("원금 : "+mybank.getMoney());
		Family1 f1 = new Family1(); //f1은 스레드 객체
		Family2 f2 = new Family2(); //f2은 스레드 객체
		
		f1.start();
		try {
			Thread.sleep(200); //0.2초 지연
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		f2.start();
	}

}
