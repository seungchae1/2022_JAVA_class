package TextInheritance10;

public class SoundExam {
	public static void main(String arg[]) {
		Sound radio=new Radio(); // UpCasting�� ���� �����̴�
								 // radio�� RadioŬ������ �ִ� �����ǵ� �޼ҵ忡 ���� ����
		Sound tv=new TV();// UpCasting�� ���� �����̴�
						  // tv�� TVŬ������ �ִ� �����ǵ� �޼ҵ忡 ���� ����
		radio.SoundUp(5);
		tv.SoundUp(5);
		
	}
}
