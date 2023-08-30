package self_study;
//객체 설계용 클래스(라이브러리 클래스)는 메인 메서드 작성 안 함
public class PracticePen {
	
	//필드(멤버변수) = 객체의 속성
	String color;
	int price;
	String productNo;
	
	//메서드 = 객체의 기능
	void write() {
		System.out.println(color+"색 글을 씁니다.");
	}
	void draw() {
		System.out.println(color+"색 그림을 그립니다.");
	}
	void priceInfo() {
		System.out.println("제품번호: "+productNo);
		System.out.println(color+"색 펜의 가격은 "+price+"원 입니다.");
	}
}
