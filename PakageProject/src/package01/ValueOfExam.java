package package01;

public class ValueOfExam {

	public static void main(String[] args) {
		char ch='A';			//문자
		String strData1="A";	//문자열
		String strData2;
		strData2 = String.valueOf(ch);	//ch에 저장되어있는 문자를 문자열로 변환
		
		if(strData1.equals(strData2)) System.out.println("같음");
		else System.out.println("다름");
	}

}
