package awtgui01;

import java.awt.*;

public class DialogExam extends Frame{
	public DialogExam() {
		super("Dialog"); // frame ����
		Dialog d = new Dialog(this, "���̾�α�"); //Dialog ����
		setSize(300, 100); //frame�� ũ��
		setVisible(true);
		d.setSize(200, 50); //Dialog�� ũ��
		d.setVisible(true);
	}
	public static void main(String args[]) {
		new DialogExam();
	}
}