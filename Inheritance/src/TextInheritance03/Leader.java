package TextInheritance03;

public class Leader extends Student{
	boolean leader;
	
	public Leader(String name, String hakbun, boolean isleader) {
		super(name,hakbun); //����Ŭ������ �Ű����� 2���� ���� ������ ȣ��
		this.leader=isleader;
	}
	void isLeader() {
		System.out.print(name+"�� ");
		if(leader)
		System.out.println("�б�ȸ���Դϴ�");
		else System.out.println("�б�ȸ���� �ƴմϴ�");
	}
}
