package bytestream;

import java.io.*;

public class BufferedExam {

	public static void main(String[] args) {
		BufferedInputStream bi= new BufferedInputStream(System.in);
		//bi가 가리키는 버퍼에 입력할 수 있는 객체 생성
		BufferedOutputStream bo= new BufferedOutputStream(System.out);
		//bo가 가리키는 버퍼에 출력할 수 있는 객체 생성
		
		int aa;
		try {
			while((aa=bi.read())!= -1) { //데이터를 읽어서 bi가 가리키는 버퍼에 입력한다.
				bo.write(aa);  //aa값을 bo가 가리키는 버퍼에 출력하다.
			}
			bo.flush(); //이 문장에서 버퍼에 저장되어 있는 데이터를 한꺼번에 화면에 출력한다.
		}catch(IOException ie) {
			
		}
	}

}
