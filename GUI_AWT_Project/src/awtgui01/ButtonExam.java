package awtgui01;

import java.awt.*;

public class ButtonExam extends Frame{
	public ButtonExam() {
		super("��ư"); // frame ����
		Panel p= new Panel();
		Button b1 = new Button();
		Button b2 = new Button("��ư2");
		
		b1.setLabel("��ư1");
		p.add(b1);
		p.add(b2);
		add(p);
		setLocation(200, 200);
		setSize(250, 100);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		new ButtonExam();
	}
}