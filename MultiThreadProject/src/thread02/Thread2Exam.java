package thread02;

public class Thread2Exam {
	public static void main(String args[]) {
		// 메인 스레드 시작
		System.out.println("프로그램 시작");
		DerivedThread d1 = new DerivedThread();
		DerivedThread d2 = new DerivedThread();
		
		d1.start();	//DerivedThread클래스에 있는 run()메소드 실행
		d2.start();	//DerivedThread클래스에 있는 run()메소드 실행
		
		System.out.println("프로그램 종료");
	}
}
