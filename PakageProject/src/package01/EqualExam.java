package package01;

public class EqualExam {

	public static void main(String[] args) {
		String str1= "mirim";
		String str2= "mirim";
		String str3= new String("meister");
		String str4= new String("meister");
		
		if(str1==str2) System.out.println("주소같다"); //ture
		else System.out.println("주소 다르다");			//주소값을 비교한다.
		
		if(str3==str4) System.out.println("주소같다");
		else System.out.println("주소 다르다");			//new를 쓰면 false
		
		if(str1.equals(str2)) System.out.println("내용같다");	//내용 비교	
		else System.out.println("내용 다르다");					//str1이 가리키는 내용이 str2가 가리키는 내용과 같은지 비교
		
		if(str3.equals(str4)) System.out.println("내용같다");
		else System.out.println("내용 다르다");
	}

}
