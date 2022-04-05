package Inheritance02;

public class Student extends Person{
	public void set() {
		age=30;
		name="홍길동";
		height=75; //Person에서 protected로 지정하면 접근가능
		
		//weight=99; //Person에서 private로 설정되어 접근불가
		setWeight(99);
	}
	
}