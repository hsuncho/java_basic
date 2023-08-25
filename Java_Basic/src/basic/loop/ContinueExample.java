package basic.loop;

public class ContinueExample {

	public static void main(String[] args) {

		for(int i =1; i<=10; i++) {
			if(i%2!=0) continue; //i가 홀수라면 건너뛰고 짝수만 출력해줘

			System.out.print(i+" ");
		}
		System.out.println("\n반복문 종료!");
	}

}
