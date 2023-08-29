package basic.method;

public class MethodQuiz01 {
	
	static int calcDivisor(int n) {
		int count =0; //약수의 개수
		System.out.printf("%d의 약수: ",n);
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
				System.out.print(i+" ");
			}
		}
		return count;
	}
	
	public static void main(String[] args) {

		/*
        1. calcDivisor()라는 메서드를 선언하세요.
        2. 이 메서드는 정수 하나를 전달받아서 해당 정수의
         모든 약수를 가로로 출력하고 약수의 개수를 리턴하는
         메서드입니다. (가로로 출력은 메서드 내부에서 진행)
        3. 메서드 선언을 완료하시고, main에서
         72의 약수의 개수와 10의 약수의 개수를 출력해 보세요.
         호출 두번 하시는 거에요.
        */
		
		int num1 = calcDivisor(72);
		System.out.println("\n약수의 개수는 " +num1+"개");
		
		int num2 = calcDivisor(10);
		System.out.println("\n약수의 개수는 " +num2+"개");
		
	}

}
