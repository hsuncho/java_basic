package oop.poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
//		p.n2 = 2; (x) 부모는 자식의 어떠한 정보도 알 수 없어
		
		p.method1();
		p.method2();
//		p.method3(); (x)
		
		System.out.println("---------------------------------");
		Child c = new Child();
		c.n1 = 1;//부모에게 물려받은 속성
		c.n2 = 2;// 자식의 고유 속성
		
		c.method1();
		c.method2();
		c.method3();

		System.out.println("---------------------------------");
		
		//다형성 적용(promotion)
		Parent p2 = new Child(); //실제로 생성된 객체는 자식이고, 부모를 참조
		p2.n1 = 1;
//		p2.n2 = 2; (x) Parent의 시각으로는 자식의 고유 속성의 존재를 알 수 없음
		
		p2.method1();
		p2.method2(); //Parent의 시각에서 method2에 대한 정보를 알고 있고, 실체가 Child이기 때문에 재정의한 함수 호출됨
//		p2.method3(); (x) 
		
		System.out.println("---------------------------------");
		/*
		 - 다형성이 적용되면 자식 클래스의
		 본래의 멤버(필드, 메서드)를 참조하지 못하는 문제가 발생합니다.
		 
		 - 이를 해결하기 위해 강제 타입 변환을 사용합니다.
		 */
		
		Child c2 = (Child) p2; // 부모 타입을 자식 타입으로 강제 변환(Downcasting)
		//하위 타입의 변수에 상위 타입을 그냥 넣어줄 수 없어.
		// 객체를 생성한 게 아니라 주소를 넘긴 것(접근 방식을 바꾼 것)
		c2.n2 = 2;
		c2.method2();
		c2.method3();
		System.out.println("p2의 주소값: "+p2);
		System.out.println("c2의 주소값: "+c2);
		
		System.out.println("---------------------------------");
		Object o = new String("안녕하세요~~");
		String str = (String) o;
		System.out.println("문자열의 길이: "+str.length());
		
		// 다형성이 한 번도 발생하지 않은 경우에는
		// 강제 형 변환을 사용할 수 없습니다.
		Parent ppp = new Parent();
//		Child ccc = (Child) ppp; //자식 타입 객체에 부모 타입 객체 주소를 넣은 것
		// child 는 실체가 생성된 적 없어(부모 객체만 생성되었기 때문에 자식 객체는 생성되지 않음)
		// 자식 타입의 부모 객체는 없다.
		
	}

}
