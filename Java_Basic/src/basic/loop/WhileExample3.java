package basic.loop;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {

		/*
		 정수 1개를 입력받아서 해당 정수가 소수(prime number)인지를 판별하자 
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int number = sc.nextInt();
		
		int i =1; // begin -> 소수의 판별의 위해서 입력받은 정수 number을 지속적으로 나누어 볼 변수
		int count = 0; // 나누어 떨어진 횟수를 기억할 변수
		
		while (i<=number) {
			if(number % i ==0) {
				count++;
			}
			i++;
		}
	
		if (count ==2) {
			System.out.println(number+"은(는) 소수입니다.");
		} else {
			System.out.println(number+"은(는) 소수가 아닙니다.");
		}
			
		System.out.println("===========================");
		
		int j =2;
		while(number%j!=0) { //end
			j++; //step
		}
		System.out.printf("%d은(는) %s.\n",number, (number ==j? "소수입니다" :"소수가 아닙니다."));
			
		sc.close();
		
	}

}
