package TextInheritance05;

public class MainTrcukExam {

	public static void main(String[] args) {
		Truck mytruck = new Truck();
		mytruck.speedUp(); // 오버라이딩이 되어서 Truck클래스에 있는 speedUp() 메소드를 호출한다
		
		mytruck.speedDown(); //Car클래스에 있는 speedDown()메소드를 호출 (오버라이딩 X)

	}

}
