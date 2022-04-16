package TextInheritance09;

public class ShapeCalculator extends ShapeExam{
	// ShpeExam에서 추상메소드로 선언된 모든 것을 여기서 구현해야 한다
	@Override
	public double geArea(int a) { //재정의 반드시 필요
		return 3.14 * a * a;
	}
	
	@Override
	public double getCircum(int a) {
		return 2 * 3.14 * a;
	}
}
