package awtgui01;

import java.awt.*;

public class PanelExam extends Frame{
	public PanelExam() {
		super("Panel"); // frame 제목
		Panel p= new Panel(); //패널 객체 생성
		p.setBackground(Color.BLUE); // Panel의 배경색 파랑으로
		add(p); // Panel을 Frame에 붙임. Frame 전체가 Panel이 됨
		setSize(500, 400);
		setVisible(true);
	}
	public static void main(String args[]) {
		new PanelExam();
	}
}