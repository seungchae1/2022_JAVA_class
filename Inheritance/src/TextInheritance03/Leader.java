package TextInheritance03;

public class Leader extends Student{
	boolean leader;
	
	public Leader(String name, String hakbun, boolean isleader) {
		super(name,hakbun); //����Ŭ������ �Ű����� 2���� ���� ������ ȣ��
		this.leader=isleader;
	}
	void isLeader() {
		if(leader) System.out.println(name+"�� �б�ȸ���Դϴ�");
		else System.out.println(name+"�� �б�ȸ���� �ƴմϴ�");
	}
}
