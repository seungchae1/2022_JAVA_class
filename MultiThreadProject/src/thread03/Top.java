package thread03;

public class Top extends Thread{
	public void run() {
		for(int i=0; i<50; i++) {
			if(i%5==0)
				System.out.println(i);
			else
				System.out.print(i+"\t");
		}
	}
}
