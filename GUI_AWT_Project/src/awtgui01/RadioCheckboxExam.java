package awtgui01;

import java.awt.*;

public class RadioCheckboxExam extends Frame{
	public RadioCheckboxExam() {
		super("라디어버튼"); // frame 제목
		Panel p= new Panel();
		
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("여자",g,true);
		Checkbox ra2 = new Checkbox("남자",g,false);
		
		p.add(ra1);
		p.add(ra2);
		add(p);
		setSize(400, 100);
		setVisible(true);
		
	}
	public static void main(String args[]) {
		new RadioCheckboxExam();
	}
}