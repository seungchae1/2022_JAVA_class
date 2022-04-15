package TextInheritance06;

public class CastingExam {
	public static void main(String[] args){
		//객체 선언
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
		//객체 생성
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		System.out.println("[" + mycar.print() + "]" ); //Car클래스의 print() 호출 
		System.out.println("[" + mybus.print() + "]" ); //Bus클래스의 print() 호출 
		System.out.println("[" + mytruck.print() + "]" ); //Truck클래스의 print() 호출 
		
		//UpCasting
		yourcar = mybus; 
		System.out.println("[" + yourcar.print() + "]" ); //yourcar.print()는 Bus클래스에 잇는 오버라이딩된 print()메소드 호출
		
		//DownCasting
		yourbus = (Bus)yourcar; //yourbus객체 생성
		System.out.println("[" + yourbus.print() + "]" ); 
		
		
		yourcar = mytruck; //UpCasting 발생
		yourtruck = (Truck)yourcar; //yourtruck객체 생성
		System.out.println("[" + yourtruck.print() + "]" ); //yourcar.print()는 yourcar가 Truck클래스로 형변환 했기 때문에
															//Truck클래스에 있는 오버라이딩된 print()메소드 호출
		
		yourtruck=(Truck)yourcar; //DownCasting //yourtruck 객체 생성
		System.out.println("[" + yourtruck.print() + "]" ); //yourtruck.print()는 Trcuk클래스에 있는 print()메소드 호출
		}
}
