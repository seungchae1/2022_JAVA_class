package bytestream;

import java.io.IOException;

public class Echo1Exam {

	public static void main(String[] args) {
		int bt;
		try { //���α׷��� �����ϱ� ���ؼ��� Ctrl+Z(-1�� ��)Ű�� ����
			while((bt= System.in.read()) != -1) {
				System.out.print((char)bt);
			}
		} catch(IOException e) {
			System.err.println();
		}

	}

}
