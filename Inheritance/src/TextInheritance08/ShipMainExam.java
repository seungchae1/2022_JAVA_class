package TextInheritance08;

public class ShipMainExam {

	public static void main(String[] args) {
		Ship myship=new MyShip(); //Upcasiting
		Ship yourship = new YourShip();
		ShipName.search(myship); //ShipName클래스에 있는 search()메소드 호출
								 //인자값으로 myship이 전달
		ShipName.search(yourship); //ShipName클래스에 있는 search()메소드 호출
								   //인자값으로 myship이 전달

	}

}
