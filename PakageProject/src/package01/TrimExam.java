package package01;

public class TrimExam {

	public static void main(String[] args) {
		String strData1=" I Love You ";
		String strData2;
		strData2 = strData1.trim(); // 문자열의 앞뒤 공백 제거
									// strData2= "I Love You";와 같다
		System.out.println("strData1.trim() --> "+strData2);
		
		if(strData1.equals(strData2)) System.out.println("같음");
		else System.out.println("다름");
	}

}
