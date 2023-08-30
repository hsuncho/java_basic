package self_study;

public class PracticePenMain {

	public static void main(String[] args) {

		/*
		 설계도에 작성한 속성과 기능을 사용하기 위해
		 객체 생성해야함
		 클래스만 제작된 채로는 아무 기능도 수행 불가 
		*/
		
		//객체 생성 문법: 클래스타입 변수명 = new 클래스이름();
		PracticePen redPen = new PracticePen();
		PracticePen bluePen = new PracticePen();
		PracticePen blackPen = new PracticePen();
		
		//참조 연산자(.)를 통해 객체로 접근한 뒤
		//속성을 지정하고 기능을 사용 가능
		redPen.color = "빨강";
		redPen.price = 500;
		
		bluePen.color = "파랑";
		bluePen.price = 600;
		
		blackPen.color="검정";
		blackPen.price=1000;
		
		redPen.write();
		bluePen.write();
		blackPen.write();
		redPen.priceInfo();
		bluePen.priceInfo();
		blackPen.priceInfo();
		
		System.out.println(redPen);
		System.out.println(bluePen);
		System.out.println(blackPen);
		
	}

}
