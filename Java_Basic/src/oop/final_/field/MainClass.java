package oop.final_.field;

public class MainClass {

	public static void main(String[] args) {

		Person kim = new Person("김철수");
//		kim.nation = "미국"; (x) 대한민국으로 초기화했기 때문에 값을 변경할 수 없어
//		kim.name = "김마이클"; (x) 객체를 생성할 때 생성자의 매개값으로 이름을 초기화했기 때문에 값을 변경할 수 없어
		kim.age = 30;
		
		Person park = new Person("박영희");
//		park.nation = "영국"; (x)
//		park.name = "박영국"; (x) 

	}

}
