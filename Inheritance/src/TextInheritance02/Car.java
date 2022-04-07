package TextInheritance02;

public class Car{
	String carname; // 차 이름
	String color="검정색"; // 색
	
	int velocity;
	void speedUp(){ // 속도 증가하다
	velocity += 5;
	}
	void speedDown(){ // 속도 감소하다
	velocity -= 5;
	}
}
