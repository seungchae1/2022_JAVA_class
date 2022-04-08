package TextInheritance03;

public class Leader extends Student{
	boolean leader;
	
	public Leader(String name, String hakbun, boolean isleader) {
		super(name,hakbun); //상위클래스의 매개변수 2개를 갖는 생성자 호출
		this.leader=isleader;
	}
	void isLeader() {
		System.out.print(name+"은 ");
		if(leader)
		System.out.println("학급회장입니다");
		else System.out.println("학급회장이 아닙니다");
	}
}
