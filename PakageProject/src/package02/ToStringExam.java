package package02;

public class ToStringExam {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programming");
		String str;
		
		str=sb1.toString();	//sb1은 StringBuffer클래스 타입의 문자열을 가리키는데 
							//toString()메소드는 sb1의 문자열을 String타입으로 변화해서 str에게 넘겨준다.
		System.out.println("str.toUpperCase() = "+str.toUpperCase());	//str이 가리키는 문자열을 대문자로 변경해서 출력
																		//str이 가리키는 문자열 자체가 변경되지는 않는다.
		System.out.println("str = "+str);
	}

}
