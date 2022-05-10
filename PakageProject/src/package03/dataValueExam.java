package package03;

import java.util.StringTokenizer;

public class dataValueExam {
	public static void main(String args[]){
		String line;
		String tmpStr = "hong 용산구 10.5 20.5";
		//StringTokenizer parse = new StringTokenizer(tmpStr);	//아래문장과 같다
		StringTokenizer parse = new StringTokenizer(tmpStr, " ");	//" " 공백기준으로 데이터를 나누겠다.
		String name;
		String address;
		double math;
		double english;
		double total;
		double avg;
		name= parse.nextToken();	//parse는 "hong 용산구 10.5 20.5" 문자열에서 hong을 가리킨다.
								 	//"hong"문자열을 name에 저장한 후에 parse는 "용산구"문자열을 가리킨다.
		address= parse.nextToken();	// address에 "용산구"문자열을 저장한 후에 parse는 10.5를 가리킨다.
		math= Double.valueOf( parse.nextToken() ).doubleValue();	//parse.nextToken()은 "10.5"를 뽑아내고, parse는 20.5를 가리킨다.
		
		english= Double.valueOf( parse.nextToken() ).doubleValue();	//Double.valueOf(parse.nextToken())은 "10.5"를 Wrapper형 실수형으로 변환	//.doubleValue()는 기본 실수형으로 변환
		total= math + english;
		avg= total /2.0;
		System.out.println( name + "\t" + address + "\t" + math + "\t" +

		english+"\t" +total+ "\t" + avg);
	}
}
