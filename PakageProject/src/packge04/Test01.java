package packge04;

public class Test01 {

	public static void main(String[] args) {
		//주사위의 눈을 출력하는데 20번 던져서 
		//숫자 * 500원을 가져간다.
		//전체 금액은?
		int dice, money=0;
		for(int i=1; i<=20; i++) {
			dice=(int)(Math.random()*6+1);
			money+=500*dice;
			System.out.println(dice+"이 나와 "+500*dice+"원을 얻음.(현재 금액 : "+money+")");
		}
		System.out.println("총 금액은 : "+money);

	}

}
