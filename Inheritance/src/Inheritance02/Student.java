package Inheritance02;

public class Student extends Person{
	public void set() {
		age=30;
		name="ȫ�浿";
		height=75; //Person���� protected�� �����ϸ� ���ٰ���
		
		//weight=99; //Person���� private�� �����Ǿ� ���ٺҰ�
		setWeight(99);
	}
	
}