package awtgui01;

import java.awt.*;

public class PanelExam extends Frame{
	public PanelExam() {
		super("Panel"); // frame ����
		Panel p= new Panel(); //�г� ��ü ����
		p.setBackground(Color.BLUE); // Panel�� ���� �Ķ�����
		add(p); // Panel�� Frame�� ����. Frame ��ü�� Panel�� ��
		setSize(500, 400);
		setVisible(true);
	}
	public static void main(String args[]) {
		new PanelExam();
	}
}