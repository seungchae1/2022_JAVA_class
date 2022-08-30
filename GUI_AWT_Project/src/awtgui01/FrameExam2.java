package awtgui01;

import java.awt.*;

public class FrameExam2 extends Frame{
	public FrameExam2() {
		super("제목"); // 부모클래스의 생성자를 호출
		// Frame("제목") 실행되면 타이틀로 "제목"이 출력
		this.setLocation(500, 300);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		FrameExam2 f = new FrameExam2();
	}
}
