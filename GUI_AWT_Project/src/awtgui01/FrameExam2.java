package awtgui01;

import java.awt.*;

public class FrameExam2 extends Frame{
	public FrameExam2() {
		super("����"); // �θ�Ŭ������ �����ڸ� ȣ��
		// Frame("����") ����Ǹ� Ÿ��Ʋ�� "����"�� ���
		this.setLocation(500, 300);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		FrameExam2 f = new FrameExam2();
	}
}
