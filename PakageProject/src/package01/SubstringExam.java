package package01;

public class SubstringExam {

	public static void main(String[] args) {
		String strData1="I Love You";
		String strData3;
		
		strData3=strData1.substring(7);	//7번째 문자(Y)부터 끝까지의 문자열을 반환
		System.out.println("strData1.substring(7) --> "+strData3);
		strData3 = strData1.substring(2, 5); //2번째 문자(L)부터 5-1(v)번째 문자까지의 문자열을 반환
		System.out.println("strData1.substring(2,5) --> "+strData3);
	}

}
