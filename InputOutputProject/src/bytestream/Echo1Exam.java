package bytestream;

import java.io.IOException;

public class Echo1Exam {

	public static void main(String[] args) {
		int bt;
		try { //����ó���ϴ� �����̴�.
			bt= System.in.read(); //read()�޼ҵ带 ����ϱ� ���ؼ��� �ݵ�� ����ó���� �� �־�� ��	//1byte�� �ַܼκ��� �����͸� �Է¹���
			System.out.print((char)bt);
		} catch(IOException e) {
			System.err.println();
		}

	}

}
