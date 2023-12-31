package oop.poly.car;

import java.util.stream.IntStream;

public class CarShop {
	
	/*
    - 키워드 instanceof는 객체가 지정한 클래스 타입을 가질 수 있는
     객체인지를 검사할 때 사용하는 연산자 입니다.
     
    - instanceof를 기준으로 좌항의 객체가 우항의 클래스 타입을 가질 수
     있는 지를 물어봐서 그렇다면 true, 그렇지 않다면 false를 도출합니다.
    */

	public void carPrice(Car c) { //부모타입의 매개 변수 -> 모든 차가 올 수 있어
		// 메서드를 부르지 않고도 전달된 객체가 무엇인지 알 수 있게 하는 instance of
		if(c instanceof Sonata) {
			// instanceof는 c 객체가 Sonata인지를 묻는 것이 아니라
			// Sonata 타입을 가질 수 있는지를 묻는 것
			System.out.println("소나타의 가격은 3000만 원입니다.");
		} else if(c instanceof Tesla) {
			System.out.println("테슬라의 가격은 7000만 원입니다.");
		} else if(c instanceof Porsche) {
			System.out.println("포르쉐의 가격은 2억 4천만 원입니다.");
		}
		
	}
	
}
