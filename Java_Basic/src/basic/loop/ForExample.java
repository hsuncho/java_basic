package basic.loop;

import java.util.Scanner;

public class ForExample {

	public static void main(String[] args) {

		/* 	int i =1; 
		  	int total = 0; 
		  	while(i<=10) { 
		  		total += i; 
		  		i++; 
		  	}
		*/
		int total = 0;
		for(int i=1; i<=10;i++) {
			total =+ i ;
		}
		System.out.println(total);
		//1~200까지의 정수 중 6의 배수이면서
		//12의 배수는 아닌 수를 가로로 출력해보세요.
		
		for (int num = 1; num<=200; num++) {
			if(num%6==0 && num%12!=0) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
		// 1~60000까지의 정수 중 177의 배수의 개수를 구해보세요.
		int count = 0;
		for(int num = 1; num <=60000; num++) {
			if(num%177==0) {
				count++;
			}
		}
		System.out.println("1부터 60000까지의 177의 배수의 개수는 "+count+"개 입니다.");
		System.out.println();
		// 정수를 하나 입력받아서
		// 입력받은 정수까지의 팩토리얼 값을 구하세요.
		
		Scanner sc= new Scanner(System.in);
		System.out.print("정수를 입력해주세요: ");
		int num = sc.nextInt();
		int facto = 1;
		
		for(int i =num; i>=1; i--) {
			facto *= i;
		}
		System.out.printf("%d의 팩토리얼 값은 %d입니다.", num, facto);
		sc.close();
	}

}
