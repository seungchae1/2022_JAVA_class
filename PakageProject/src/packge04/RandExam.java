package packge04;

public class RandExam {

	public static void main(String[] args) {
		System.out.println(Math.random()); 	//0 < 어떤실수 < 1
		System.out.println(Math.random());	//랜덤값(0.xxxx...)을 먼저 int형으로 바꾸고(0) 5를 곱함 => 결과 항상 0
		System.out.println((int)Math.random()*5);
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*100));
	}

}
