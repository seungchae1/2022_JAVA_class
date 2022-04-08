package TextInheritance02;

public class Truckmain {
	public static void main(String[] args){
		Truck mytruck = new Truck();
		mytruck.carname = "프론티어";
		mytruck.ton = 3;
		mytruck.velocity=100;
		System.out.println("나의 트럭은 " + mytruck.color + "이다.");
		System.out.println(mytruck.carname+"는 "+mytruck.ton +"톤을 실을 수 있다");
		System.out.println("트럭의 속도는 "+mytruck.velocity + "이다");
		mytruck.speedUp();
		System.out.println("트럭의 속도는 "+mytruck.velocity + "로 5증가했다");
		mytruck.speedDown();
		System.out.println("트럭의 속도는 "+mytruck.velocity + "로 5감소했다");
	}
}