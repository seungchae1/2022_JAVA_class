package TextInheritance04;

public class CircleMainTest extends CircleArea_Exam{

	public static void main(String[] args) {
		CircleArea_Exam cp = new CircleArea_Exam();
		// System.out.println("원의 면적은 "+cp.area(10));
		// area()메소드는 접근지정자가 private로 지정되어있어서 현재 클래스에서 접근 불가 
		
		System.out.println("원의 둘레는 "+cp.round(10));
		// round()메소는 protected로 지정되어서 같은 패키지에 있으면 접근 가능
		// 다른 패키지에 있더라도 상속관계라면 접근 가능
	}

}
