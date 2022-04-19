package package01;

public class CharAtExam {

	public static void main(String[] args) {
		String str="I love Korea";
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)); //str이 가리키는 문자열의 0번째부터 length()번째까지 1문자씩 출력
											 //i의 범위 0 ~ length()-1
		}
		System.out.println();
	}

}
