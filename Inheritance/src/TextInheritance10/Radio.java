package TextInheritance10;

public class Radio  implements Sound{
	//Sound인터페이스에 있는 추상메소드를 '반드시' 구현
	private int SndLevel;
	public Radio() {
		SndLevel=0;
	}
	
	//재정의
	public void SoundUp(int level) {
		SndLevel+=level;
		System.out.println("라디오 볼륨 " + level+ "증가");
	}

	//재정의
	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel < 0) {
			SndLevel=0;
		}
	}
}
