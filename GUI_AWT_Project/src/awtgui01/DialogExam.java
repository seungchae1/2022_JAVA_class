package awtgui01;

import java.awt.*;

public class DialogExam extends Frame{
	public DialogExam() {
		super("Dialog"); // frame 제목
		Dialog d = new Dialog(this, "다이얼로그"); //Dialog 제목
		setSize(300, 100); //frame의 크기
		setVisible(true);
		d.setSize(200, 50); //Dialog의 크기
		d.setVisible(true);
	}
	public static void main(String args[]) {
		new DialogExam();
	}
}