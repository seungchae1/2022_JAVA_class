package TextInheritance08;

public class ShipMainExam {

	public static void main(String[] args) {
		Ship myship=new MyShip(); //Upcasiting
		Ship yourship = new YourShip();
		ShipName.search(myship); //ShipNameŬ������ �ִ� search()�޼ҵ� ȣ��
								 //���ڰ����� myship�� ����
		ShipName.search(yourship); //ShipNameŬ������ �ִ� search()�޼ҵ� ȣ��
								   //���ڰ����� myship�� ����

	}

}
