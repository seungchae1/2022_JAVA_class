package thread04;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep();
			//Thread.sleep(1000);	//오류 발생 : 반드시 try-catch문 작성
			try {Thread.sleep(500);}catch(Exception e) {} //sleep() 숫자는 milliseconds
			//0.5초 실행 지연
		}

		for(int i=0; i<5; i++){
			System.out.println("띵");
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
