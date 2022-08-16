package thread04;

public class Top implements Runnable{
	public void run() {
		for(int i=0; i<30; i++)
			System.out.println(Thread.currentThread().getName()+i);
			//현재 스레드의 이름을 가져와서 i값과 함께 출력
	}
}
