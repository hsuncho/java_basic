package etc.api.util.random;

import java.util.Random; //util패키지이므로 import 필요

public class RandomExample {

	public static void main(String[] args) {

		Random r = new Random();
		
		//실수 난수: 0.0 <= ~ 1.0
		double d = r.nextDouble();
		System.out.println(d);
		
		//정수 난수: nextInt();
		int i = r.nextInt(); //기본범위: int의 전범위(-21억~21억)
		System.out.println(i);
		
		//0 ~ 5까지의 정수 난수 생성(끝값이 미만으로 인식됨)
		int j = r.nextInt(6);//0부터 6미만까지
		System.out.println(j);
		
		//10 ~ 100까지의 정수 난수 생성
		int k = r.nextInt(91)+10; //형변환 필요 없어
		System.out.println(k);
		
		boolean flag = r.nextBoolean(); //true or false 랜덤으로 반환
		System.out.println(flag); 

	}

}
