package thread04;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; i++){
			toolkit.beep();
			//Thread.sleep(1000);	//���� �߻� : �ݵ�� try-catch�� �ۼ�
			try {Thread.sleep(500);}catch(Exception e) {} //sleep() ���ڴ� milliseconds
			//0.5�� ���� ����
		}

		for(int i=0; i<5; i++){
			System.out.println("��");
			toolkit.beep();
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}

}
