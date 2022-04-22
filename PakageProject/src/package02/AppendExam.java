package package02;

public class AppendExam {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		
		str1 = sb1.append(" Project");  //sb1이 가리키는 문자열뒤에 "Project"가 추가된다. 다라서 sb1이 가리키는 문자열에 데이터가 추가되었기 때문에 데이터 변경이 발생한다.
										//str은 sb1과 같은 문자열의 주솔ㄹ 가리킨다. -> 출력하면 같은 결과가 나온다.
		str2 = sb1.append(sb2);			//변경된 sb1이 가리키는 문자열에 sb2문자열을 추가한다.
										//str2, str1, sb1은 같은 문자열의 주소값을 가지게 된다. -> 출력하면 같은 결과가 나온다.
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}
}
