package package03;

import java.util.StringTokenizer;

public class dataValueExam {
	public static void main(String args[]){
		String line;
		String tmpStr = "hong ��걸 10.5 20.5";
		//StringTokenizer parse = new StringTokenizer(tmpStr);	//�Ʒ������ ����
		StringTokenizer parse = new StringTokenizer(tmpStr, " ");	//" " ����������� �����͸� �����ڴ�.
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		name= parse.nextToken();	//parse�� "hong ��걸 10.5 20.5" ���ڿ����� hong�� ����Ų��.
								 	//"hong"���ڿ��� name�� ������ �Ŀ� parse�� "��걸"���ڿ��� ����Ų��.
		address= parse.nextToken();	// address�� "��걸"���ڿ��� ������ �Ŀ� parse�� 10.5�� ����Ų��.
		math= Double.valueOf( parse.nextToken() ).doubleValue();	//parse.nextToken()�� "10.5"�� �̾Ƴ���, parse�� 20.5�� ����Ų��.
		
		english= Double.valueOf( parse.nextToken() ).doubleValue();	//Double.valueOf(parse.nextToken())�� "10.5"�� Wrapper�� �Ǽ������� ��ȯ	//.doubleValue()�� �⺻ �Ǽ������� ��ȯ
		total= math + english;
		avg= total /2.0;
		System.out.println( name + "\t" + address + "\t" + math + "\t" +

		english+"\t" +total+ "\t" + avg);
	}
}
