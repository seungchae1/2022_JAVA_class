package TextInheritance08;

public class ShipName {
	public static void search(Ship s){ //Ŭ���� �޼ҵ�
		if(s instanceof MyShip){ // Ship s = MyShip�� ���� //true�� �ȴ�
		MyShip b = (MyShip)s; 
		System.out.println("MyShip �̸� : " + b.Name());
		}else if(s instanceof YourShip){ // Ship s = YourShip�� ���� //true�� �ȴ�
		YourShip b = (YourShip)s;
		System.out.println("YourShip �̸� : " + b.Name());
		}
	}
}
