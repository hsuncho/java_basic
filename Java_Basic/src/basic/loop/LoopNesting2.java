package basic.loop;

import java.util.Scanner;

public class LoopNesting2 {

	public static void main(String[] args) {
		/*
        - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
         가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.
         
        ex)
        입력받은 수 -> 30
        소수: 2 3 5 7 11 13 17 19 23 29
        소수의 개수: 10개
       */
       
		// num = 입력받은 수
		// count = 입려받은 수까지의 소수의 개수
		//  cnt = 약수의 개수
		// i = 1부터 num까지 약수인지 아닌지를 판별하기 위해 1씩 증가시킬 수
		// j = 약수의 개수를 세기 위해 i를 나눌 수
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = sc.nextInt();
		int count =0;
		System.out.print("소수: ");
		for(int i = 1;i<=num;i++) {
			int cnt =0; // 소수의 판별을 위해서 약수의 개수를 세줄 변수 ; i의 값이 바뀔 때마다 cnt는 0이 되어야해
			for(int j=1;j<=i;j++) {
				if(i%j==0) cnt++;
			}
			if(cnt ==2) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n소수의 개수: "+count+"개");
		sc.close();
	}

}
