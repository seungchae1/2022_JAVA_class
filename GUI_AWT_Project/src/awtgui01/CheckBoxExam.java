package awtgui01;

import java.awt.*;

public class CheckBoxExam extends Frame{
	public CheckBoxExam() {
		super("üũ�ڽ�"); // frame ����
		Panel p= new Panel();
		Checkbox ck1 = new Checkbox("���");
		Checkbox ck2 = new Checkbox("����",true);
		Checkbox ck3 = new Checkbox("Ű��");
		
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		add(p);
		setSize(400, 100);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		new CheckBoxExam();
	}
}