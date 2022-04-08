package TextInheritance03;

public class Leader extends Student{
	boolean leader;
	
	public Leader(String name, String hakbun, boolean isleader) {
		super(name,hakbun); //상위클래스의 매개변수 2개를 갖는 생성자 호출
		this.leader=isleader;
	}
	void isLeader() {
		if(leader) System.out.println(name+"은 학급회장입니다");
		else System.out.println(name+"은 학급회장이 아닙니다");
	}
}
