package basic.constate;

import java.util.Scanner;

public class IfQuiz03 {

	public static void main(String[] args) {
		/*
         - 정수 3개를 입력 받습니다.
         - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.

         # max, mid, min이라는 변수를 미리 선언하셔서
          판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
          마지막에 한번에 출력하시면 되겠습니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
		System.out.print("세 번째 정수를 입력하세요: ");
		int num3 = sc.nextInt();

		int max=num1;
		int mid;
		int min=num1;

		// 최댓값 구하기
		if(num2>max) max=num2;
		if(num3>max) max=num3;

		// 최솟값 구하기
		if(num2<min) min=num2;
		if(num3<min) min=num3;

		//중간값 구하기
		if (num1 >= num2) { 
			if (num2 >= num3) { //num1 >= num2 >= num3 
				mid = num2;
			} else if (num1 <= num3) { //num3 >= num1 >= num2
				mid = num1;
			} else { //num1 >= num3 >= num2
				mid = num3;
			}
		} else if (num1 > num3) { //num2>num1
			mid = num1;
		} else if (num2 > num3) {
			mid=num3;
		} else { //num3>=num2>num1
			mid=num2;
		}

		System.out.printf("최댓값은 %d, 중간값은 %d, 최솟값은 %d입니다.",max,mid,min);

		sc.close();
	}

}
