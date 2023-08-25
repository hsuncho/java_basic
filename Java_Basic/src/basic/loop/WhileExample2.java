package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		//48~150사이의 정수 중 8의 배수만 가로로 출력해보세요.
		int num = 48;
		while (num<=150) {
			if(num%8==0) {
				System.out.print(num+" ");
			}
			num++;
		}
		System.out.println(); // 단순 줄개행
		
		// 1~100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해보세요
		
		int i = 1;
		while(i<=100) {
			if(i%4==0) {
				if(i%8!=0) {
					System.out.print(i+" ");
				}
			}
			i++;
		}
		
		System.out.println();
		
		// 1~30000까지의 정수 중 258의 배수의 개수를 출력
		int count = 0; // 배수의 개수를 세줄 변수
		int k = 1;
		while (k<=30000) {
			if(k%258==0) {
				count++;
			}
			k++;
		}
		System.out.println("258의 배수의 개수는 "+count+"개");
		System.out.println();
		//1000의 약수의 개수를 구하세요.
		//1부터 1000까지 하나씩 올려가면서 1000이랑 나눠보세요.
		//그랬을 때 나누어 떨어지는 애가 약수입니다.
		
		int j = 1;
		int coun = 0;
		while (j<=1000){
			if(1000%j==0) {
				coun++;
			}
		j++;	
		}
		System.out.print("1000의 약수의 개수는 "+coun+"개");
		
		
	}

}
