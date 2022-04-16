package TextInheritance10;

public class TV implements Sound{
	//Sound인터페이스에 있는 추상메소드를 '반드시' 구현
	private int SndLevel;
	public TV() {
		SndLevel=0;
	}
	
	//재정의
	public void SoundUp(int level) {
		SndLevel+=level;
		System.out.println("TV 볼륨 " + level+ "증가");
	}

	//재정의
	public void SoundDown(int level) {
		SndLevel-=level;
		if(SndLevel < 0) {
			SndLevel=0;
		}
	}
}
