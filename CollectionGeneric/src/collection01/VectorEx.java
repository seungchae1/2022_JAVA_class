package collection01;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v= new Vector<Integer>();
		//�⺻������ 10���� ������ ����
		System.out.println("������ ���� �뷮1 : "+v.capacity());
		
		v.add(5); // 0��°�� 5����
		v.add(4); // 1��°�� 4����
		v.add(-1); // 2��°�� -1����
		
		//������ ������ 10�� �̻��� �Ǹ� �ڵ����� 10���� �������� �߰������ȴ�
		v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);
		v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);
		
		//���� �߰��� �����ϱ�
		v.add(2, 100); // 2��°�濡 100�� ���� => ���� 2��°�濡 �ִ� �����ʹ� �ڵ����� 3��������� �̵�
		
		System.out.println("���� ���� ��� ��ü �� : "+v.size()); //���� �����Ͱ� ����ִ� ���� ����
		System.out.println("������ ���� �뷮2 : "+v.capacity()); // ��ü ������ ũ��
		
		// ��� ��� ���� ����ϱ�
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i); //�ڵ����� ��ڽ�(��üŸ���� �⺻Ÿ������ ��ȯ)
			System.out.print(n+"\t");
		}
		
		//������ ��� ���� ���ϱ�
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum+= n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : "+sum);
	}
}
