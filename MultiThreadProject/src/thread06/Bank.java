package thread06;

public class Bank {
	private int money =10000;
	public int getMoney() {return this.money;}
	public void setMoney(int money) {this.money = money;}
	public void saveMoney(int save) {
		int m = this.getMoney();
		try {
			Thread.sleep(500); //0.5�� ����
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m+save);
	}
	public void minusMoney(int minus) {
		int m = this.getMoney();
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setMoney(m-minus);
	}
}
