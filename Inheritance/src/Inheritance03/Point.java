package Inheritance03;

public class Point {
	private int x,y;
	public Point() { //매개변수 없는 기본생성자
		x=0; y=0;
		//this.x=0;
		//this.y=0;
	}
	public Point(int x, int y) { //매개변수를 2개 갖는 생성자
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}