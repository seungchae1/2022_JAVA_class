package TextInheritance06;

public class CastingExam {
	public static void main(String[] args){
		//��ü ����
		Car mycar, yourcar;
		Bus mybus, yourbus;
		Truck mytruck, yourtruck;
		
		//��ü ����
		mycar = new Car();
		mybus = new Bus();
		mytruck = new Truck();
		
		System.out.println("[" + mycar.print() + "]" ); //CarŬ������ print() ȣ�� 
		System.out.println("[" + mybus.print() + "]" ); //BusŬ������ print() ȣ�� 
		System.out.println("[" + mytruck.print() + "]" ); //TruckŬ������ print() ȣ�� 
		
		//UpCasting
		yourcar = mybus; 
		System.out.println("[" + yourcar.print() + "]" ); //yourcar.print()�� BusŬ������ �մ� �������̵��� print()�޼ҵ� ȣ��
		
		//DownCasting
		yourbus = (Bus)yourcar; //yourbus��ü ����
		System.out.println("[" + yourbus.print() + "]" ); 
		
		
		yourcar = mytruck; //UpCasting �߻�
		yourtruck = (Truck)yourcar; //yourtruck��ü ����
		System.out.println("[" + yourtruck.print() + "]" ); //yourcar.print()�� yourcar�� TruckŬ������ ����ȯ �߱� ������
															//TruckŬ������ �ִ� �������̵��� print()�޼ҵ� ȣ��
		
		yourtruck=(Truck)yourcar; //DownCasting //yourtruck ��ü ����
		System.out.println("[" + yourtruck.print() + "]" ); //yourtruck.print()�� TrcukŬ������ �ִ� print()�޼ҵ� ȣ��
		}
}
