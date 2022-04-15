package TextInheritance08;

public class ShipName {
	public static void search(Ship s){ //클래스 메소드
		if(s instanceof MyShip){ // Ship s = MyShip과 같다 //true가 된다
		MyShip b = (MyShip)s; 
		System.out.println("MyShip 이름 : " + b.Name());
		}else if(s instanceof YourShip){ // Ship s = YourShip과 같다 //true가 된다
		YourShip b = (YourShip)s;
		System.out.println("YourShip 이름 : " + b.Name());
		}
	}
}
