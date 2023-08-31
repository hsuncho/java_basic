package oop.encap.good;

public class MyBirthAns {
	
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year) {
		if(year<1900 || year> 2023) {
			System.out.println("잘못된 연도 입력입니다.");
		} else {
			this.year = year;
		}
	}
	
	public int getYear(String pw) {
		if(pw.equals("aaa1111!")) {
			return this.year;
		} else {
			System.out.println("비밀번호가 틀렸습니다.");
			return 0;
		}
		
	}
	
	public void setMonth(int month) {
		if(month<1 || month> 12) {
			System.out.println("잘못된 달 입력입니다.");
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
			return this.month;
	}
	
	public void setDay(int day) {
		if(day > 31 || day < 1) {
			System.out.println("잘못된 일 입력입니다.");
		} else {
			if(this.month == 0) {
				System.out.println("일자를 입력하기 위해서는 월 입력이 선행되어야 합니다.");
				return;
			}
			if(!isValidateMonth(day)) {
				System.out.println("월에 따른 일 입력이 잘못 되었습니다.");
				return;		
			}
			this.day = day;
		}
	}
	
	public int getDay() {
			return this.day;
	}
	
	public void birthInfo() {
		if(this.year==0 || this.month==0 || this.day==0) {
			System.out.println("날짜 필드 중에 초기화되지 않은 데이터가 있습니다.");
			return;
		}
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", this.year,this.month, this.day);	
	}
	
	private boolean isValidateMonth(int day) {
		switch(this.month) {
		case 2:
			if(day>28) {
				return false;
			} 
		case 4:case 6:case 9:case 11:
			if(day>30) {
				return false;
			} 
		default:
			return true;
		}
	}
}

