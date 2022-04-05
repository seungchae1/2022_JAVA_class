package Inheritance03;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y, String color) {
		//super(); //상위 클래스의 기본 생성자를 후출
		super(x, y); //이 메소드에서 반드시 처음 위치에 있어야 함 //상위 클래스의 매개변수 2개를 갖는 생성자를 호출
		//super(); //중복해서 super()메소드 사용불가
		this.color=color;
	}
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}