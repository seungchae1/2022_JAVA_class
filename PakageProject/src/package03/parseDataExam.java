package package03;

public class parseDataExam {

	public static void main(String[] args) {
		String a ="10", b="20";
		int sum=0;
		float average=0;
		System.out.println("Input data : "+a+" "+b);
		int c=Integer.parseInt(a);	//문자열 a의 값을 정수형으로 변환, c에 저장
		int d=Integer.parseInt(b);	//문자열 b의 값을 정수형으로 변환, d에 저장
		sum=c+d;
		average=sum/2;
		System.out.println(a+" "+b+"="+sum);
		System.out.println("평균 = "+average);
	}

}
