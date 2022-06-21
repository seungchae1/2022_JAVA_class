package thread03;

public class Runnable1Exam {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Top t = new Top();	//Runnable 인터페이스를 구현한 Top클래스 객체 생성
		Thread thd = new Thread(t);	//Top클래스의 객체값을 인자로 한 Thread thd객체 생성
		thd.start();
		// Top클래스에 있는 run()메소드가 동작
		System.out.println("프로그램 종료");
	}

}
