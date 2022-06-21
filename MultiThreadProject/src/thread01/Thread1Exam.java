package thread01;

public class Thread1Exam {
	public static void main(String args[]) { //main 쓰레드가 실행
		System.out.println("프로그램 시작");
		Top d = new Top();
		d.start(); //Top 클래스의 run()메소드가 실행
		System.out.println("프로그램 종료");
		//main스레드와 Top의 run()메소드는 동시에 실행됨
		//main스레드가 종료되어도 Top클래스의 run()메소드는 동작함
	}
}
