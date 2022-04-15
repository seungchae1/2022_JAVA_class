package TextInheritance05;

public class Truck extends Car{

	void speedUp() {
		velocity +=10;
		System.out.println("속도 "+velocity+"증가");
	}
}
