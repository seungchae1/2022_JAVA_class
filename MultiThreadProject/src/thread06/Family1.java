package thread06;

public class Family1 extends Thread{
	public void run() {
		/*
		synchronized (BankExam.mybank) {
			BankExam.mybank.saveMoney(5000);
		}
		*/
		//family1클래스와 family2클래스에서 mybank객체변수를 공유하기 때문에 이상한 결과가 나온다.
		BankExam.mybank.saveMoney(5000);
		
		System.out.println("saveMoney(5000) : "+ BankExam.mybank.getMoney());
	}

}
