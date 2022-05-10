package bytestream;

import java.io.IOException;

public class Echo1Exam {

	public static void main(String[] args) {
		int bt;
		try { //프로그램을 종료하기 위해서는 Ctrl+Z(-1의 값)키를 누름
			while((bt= System.in.read()) != -1) {
				System.out.print((char)bt);
			}
		} catch(IOException e) {
			System.err.println();
		}

	}

}
