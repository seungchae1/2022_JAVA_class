package bytestream;

import java.io.*;

public class BufferedExam {

	public static void main(String[] args) {
		BufferedInputStream bi= new BufferedInputStream(System.in);
		//bi�� ����Ű�� ���ۿ� �Է��� �� �ִ� ��ü ����
		BufferedOutputStream bo= new BufferedOutputStream(System.out);
		//bo�� ����Ű�� ���ۿ� ����� �� �ִ� ��ü ����
		
		int aa;
		try {
			while((aa=bi.read())!= -1) { //�����͸� �о bi�� ����Ű�� ���ۿ� �Է��Ѵ�.
				bo.write(aa);  //aa���� bo�� ����Ű�� ���ۿ� ����ϴ�.
			}
			bo.flush(); //�� ���忡�� ���ۿ� ����Ǿ� �ִ� �����͸� �Ѳ����� ȭ�鿡 ����Ѵ�.
		}catch(IOException ie) {
			
		}
	}

}
