package Inheritance03;

public class Point {
	private int x,y;
	public Point() { //�Ű����� ���� �⺻������
		x=0; y=0;
		//this.x=0;
		//this.y=0;
	}
	public Point(int x, int y) { //�Ű������� 2�� ���� ������
		this.x=x;
		this.y=y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}