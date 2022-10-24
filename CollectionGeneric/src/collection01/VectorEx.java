package collection01;

import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v= new Vector<Integer>();
		//기본적으로 10개의 공간을 생성
		System.out.println("벡터의 현재 용량1 : "+v.capacity());
		
		v.add(5); // 0번째방 5삽입
		v.add(4); // 1번째방 4삽입
		v.add(-1); // 2번째방 -1삽입
		
		//데이터 저장이 10개 이상이 되면 자동으로 10개의 기억공간이 추가생성된다
		v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);
		v.add(1);v.add(1);v.add(1);v.add(1);v.add(1);
		
		//벡터 중간에 삽입하기
		v.add(2, 100); // 2번째방에 100을 삽입 => 원래 2번째방에 있던 데이터는 자동으로 3번재방으로 이동
		
		System.out.println("벡터 내의 요소 객체 수 : "+v.size()); //실제 데이터가 들어있는 방의 개수
		System.out.println("벡터의 현재 용량2 : "+v.capacity()); // 전체 기억공간 크기
		
		// 모든 요소 정수 출력하기
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i); //자동으로 언박싱(객체타입을 기본타입으로 변환)
			System.out.print(n+"\t");
		}
		
		//벡터의 모든 정수 더하기
		int sum =0;
		for(int i=0; i<v.size(); i++) {
			int n = v.elementAt(i);
			sum+= n;
		}
		System.out.println("벡터에 있는 정수 합 : "+sum);
	}
}
