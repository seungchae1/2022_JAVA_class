package bytestream;

import java.io.IOException;

public class Echo1Exam {

	public static void main(String[] args) {
		int bt;
		try { //예외처리하는 문장이다.
			bt= System.in.read(); //read()메소드를 사용하기 위해서는 반드시 예외처리를 해 주어야 함	//1byte를 콘솔로부터 데이터를 입력받음
			System.out.print((char)bt);
		} catch(IOException e) {
			System.err.println();
		}

	}

}
