package TextInheritance03;

public class Leader extends Student{
	boolean leader;
	
	public Leader(String name, String hackbun, boolean isleader) {
		this.name=name;
		this.hakbun=hakbun;
		this.leader=isleader;
	}
	void isLeader() {
		System.out.print(name+"은 ");
		if(leader)
		System.out.println("학급회장입니다");
		else System.out.println("학급회장이 아닙니다");
	}
}
