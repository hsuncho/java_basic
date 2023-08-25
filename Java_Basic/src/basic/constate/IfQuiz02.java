package basic.constate;

import java.util.Scanner;

public class IfQuiz02 {
	public static void main(String[] args) {
		/*
	     # 스캐너를 사용하여 정수를 하나 입력받으세요.
	     
	     - 입력받은 값이 7의 배수라면 "7의 배수입니다." 를 출력.
	     - 입력받은 값이 7의 배수가 아니라면 "7의 배수가 아닙니다." 를 출력.
	     - 입력받은 값이 0이라면 "0입니다." 를 출력하세요.
	    */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		
		int num = sc.nextInt();
		// 7로 나누었을 때 나머지가 0이면서 num이 0ㅇ이 아닌지, num이 0인지, 7의배수가 아닌지
		// 물어볼 수도 있음
		
		 if (num==0) { 
			System.out.println("0입니다.");
		 	} else if (num %7 == 0) {
		 		System.out.println(num+"은(는) 7의 배수입니다.");
			} else {
				System.out.println(num+"은(는) 7의 배수가 아닙니다.");
			}
		
		sc.close();
	}

}
