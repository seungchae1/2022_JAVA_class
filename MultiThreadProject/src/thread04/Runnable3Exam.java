package thread04;

public class Runnable3Exam {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Top t = new Top(); // Top 클래스 객체 t 생성
		Thread thd1 = new Thread(t, "a"); //생성된 t 객체를 이용하여 스레드 객체 thd1 생성, 스레드 이름을 a로 설정
		Thread thd2 = new Thread(t, "b");
		System.out.println(thd1.getPriority()); //스레드 객체의 우선순위를 출력
		System.out.println(thd2.getPriority());	//우선순위의 디폴드값은 5로 되어있음
		thd1.setName("new_a");
		thd2.setName("new_b");
		thd1.setPriority(9);
		thd2.setPriority(thd2.MIN_PRIORITY); //1
		System.out.println(thd1.getPriority());
		System.out.println(thd2.getPriority());
		
		thd1.start(); //new_a가 상대적으로 더 먼저 나온다 (우선순위 9)
		thd2.start();
		System.out.println("프로그램 종료");
	}
}
