package oop.inter.good;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//다형성 적용을 위해 인터페이스 타입의 변수를 하나 선언
		IUserService sv;
		//객체는 사용자가 선택하는 것에 따라 달라질 것이기 때문에 객체는 생성 안 함
		
		System.out.println("진행하길 번호를 입력하세요");
		System.out.println("1. 가입 2. 로그인 3. 정보수정 4. 탈퇴");
		System.out.print("> ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			sv = new Join();
			sv.execute();
		} else if(menu ==2) {
			sv = new Login();
			sv.execute();
		} else if(menu == 3) {
			sv = new Update();
			sv.execute();
		} else if(menu ==4) {
			sv = new Delete();
			sv.execute();
		}
		sc.close();
	}

}
