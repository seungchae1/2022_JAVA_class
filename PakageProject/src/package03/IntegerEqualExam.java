package package03;

public class IntegerEqualExam {

	public static void main(String[] args) {
		Integer in1= new Integer(100);								//주소값이 stack영역에 저장되고, 가리키는 값은 heap영역에 저장된다.
		Integer in2= new Integer(100);
		Integer in3= new Integer(200);
		
		int a=300, b=400;
		
		System.out.println("in1.equals(in2) ==> "+in1.equals(in2));	//in1과 in2가 가ㅣ키는 값을 비교해서 같으면 true, 다르면 false를 반환
		System.out.println("in1.equals(in3) ==> "+in1.equals(in3));
		//System.out.println("a.equals(b) ==> "+a.equals(b));		//오류발생 		//equals()는 객체타입을 비교하는 메소드
		
		in1=a;
		in2=300;
		System.out.println("in1.equals(in2) ==> "+in1.equals(in2));
	}

}
