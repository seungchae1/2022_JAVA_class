package TextInheritance10;

public class TV implements Sound{
	//Sound�������̽��� �ִ� �߻�޼ҵ带 '�ݵ��' ����
	private int SndLevel;
	public TV() {
		SndLevel=0;
	}
	
	//������
	public void SoundUp(int level) {
		SndLevel+=level;
		System.out.println("TV ���� " + level+ "����");
	}

	//������
	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel < 0) {
			SndLevel=0;
		}
	}
}
