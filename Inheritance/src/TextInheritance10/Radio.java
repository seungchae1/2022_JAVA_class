package TextInheritance10;

public class Radio  implements Sound{
	//Sound�������̽��� �ִ� �߻�޼ҵ带 '�ݵ��' ����
	private int SndLevel;
	public Radio() {
		SndLevel=0;
	}
	
	//������
	public void SoundUp(int level) {
		SndLevel+=level;
		System.out.println("���� ���� " + level+ "����");
	}

	//������
	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel < 0) {
			SndLevel=0;
		}
	}
}
