package Inheritance01;

public class Point {
	private int x,y; //한점을 구성하는 x,y 좌표
	public void set(int x, int y) { //좌표값을 멤버변수에 저장
		this.x=x;
		this.y=y;
	}
	public void showPoint() { //점을 출력
		System.out.println("("+x+","+y+")");
	}
}