package package02;

public class ReverseExam {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("java Programming");
		StringBuffer sb2 = null;
		
		sb2=sb1.reverse(); //sb1이 가리키는 문자열을 역순으로 변경 => sb2에게 주소값을 넘겨준다.
		System.out.println("sb2==> "+sb2);
		System.out.println("sb1==> "+sb1);
	}

}
