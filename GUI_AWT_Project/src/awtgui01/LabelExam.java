package awtgui01;

import java.awt.*;

public class LabelExam extends Frame{
	public LabelExam() {
		super("Lable"); // frame 제목
		Panel p= new Panel();
		
		Label label1 = new Label("레이블1");
		Label label2 = new Label("레이블2", Label.CENTER);
		
		label1.setBackground(Color.yellow);
		label2.setBackground(Color.cyan);
		
		p.add(label1);
		p.add(label2);
		add(p);
		setSize(300, 100);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		new LabelExam();
	}
}
