package package02;

public class AppendExam {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		
		str1 = sb1.append(" Project");  //sb1�� ����Ű�� ���ڿ��ڿ� "Project"�� �߰��ȴ�. �ٶ� sb1�� ����Ű�� ���ڿ��� �����Ͱ� �߰��Ǿ��� ������ ������ ������ �߻��Ѵ�.
										//str�� sb1�� ���� ���ڿ��� �ּ֤� ����Ų��. -> ����ϸ� ���� ����� ���´�.
		str2 = sb1.append(sb2);			//����� sb1�� ����Ű�� ���ڿ��� sb2���ڿ��� �߰��Ѵ�.
										//str2, str1, sb1�� ���� ���ڿ��� �ּҰ��� ������ �ȴ�. -> ����ϸ� ���� ����� ���´�.
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
	}
}
