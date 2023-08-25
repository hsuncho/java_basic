package basic.loop;

import java.util.Scanner;

public class BreakQuiz01 {

	public static void main(String[] args) {


		/*
        1. 2가지의 정수를 1~100사이의 난수를 발생시켜서 
         지속적으로 문제를 출제한 후 정답을 입력받으세요.
         사용자가 0을 입력하면 반복문을 탈출시키세요.
         
        2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
       */
		
		System.out.println("*** 연산 퀴즈 ***");
		System.out.println("# 종료하시려면 0을 입력해주세요");
		
		Scanner sc= new Scanner(System.in);
		
		int correct = 0; // 맞힌 개수를 담을 변수
		int wrong = 0; // 틀린 개수를 담을 변수
		
		while(true) {
			int fir = (int)((Math.random()*100)+1); // 첫 번째 정수
			int sec = (int)((Math.random()*100)+1); // 두 번째 정수
			int operIdx = (int)(Math.random()*2); // 연산자의 번호를 랜덤으로 추출하기 위해 생성한 변수

			int coAns; //연산자의 종류에 따라 옳은 정답에 도달하는 계산 방법이 달라지므로, 그 방법을 담을 변수
			
			if (operIdx ==0) { // 연산자의 번호가 0이라면 +를 출력할 거야
				System.out.printf("%d + %d = ??", fir, sec);
				coAns = fir+sec; // 연산자가 덧셈으로 출력된다면 정답은 이런식으로 출력해야 해
			} else {
				System.out.printf("%d - %d = ??", fir, sec);
				coAns= fir-sec;
			}
			
			System.out.print("\n> ");
			int answer = sc.nextInt();
			
			if(answer == coAns) { //사용자가 입력한 답과 정답이 일치하니?
				System.out.println("정답입니다.");
				correct++; // 맞힌 개수 1 증가
			} else if(answer == 0) { //사용자가 입력한 답이 0이니?
				System.out.println("종료합니다");
				break; //가까운 반복문인 무한루프 탈출
			} else { //사용자가 입력한 답이 오답이니?
				System.out.println("오답입니다.");
				wrong++; //틀린 개수 1 증가
			}
		}
		
		System.out.println("-----------");
		System.out.printf("정답 횟수: %d회", correct);
		System.out.printf("\n오답 횟수: %d회", wrong);
		sc.close();
	}

}
















