package TextInheritance09;

public class ShapeMainTest {
	public static void main(String arg[]) {
		ShapeCalculator s= new ShapeCalculator(); //s는 ShapeCalulator
		System.out.println("원의 면적은 "+s.geArea(10));
		System.out.println("원의 면적은 "+s.getCircum(10));
	}
}
