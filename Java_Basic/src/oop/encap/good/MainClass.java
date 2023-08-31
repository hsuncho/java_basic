package oop.encap.good;

public class MainClass {

	public static void main(String[] args) {

		
		MyBirthAns my = new MyBirthAns();
//		my.year = 1992; not allowed for access
		my.setYear(1992);
		my.setMonth(2);
		my.setDay(31);
		
		my.birthInfo();
//		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", my.getYear("aaa1111!"),my.getMonth(), my.getDay());
	}

}
