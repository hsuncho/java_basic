package basic.loop;

public class ForQuiz01 {

	public static void main(String[] args) {

		//2~19까지의 난수를 생성해서 구구단을 출력해보세요.
		//19행까지 출력하세요
		
		int num = (int)((Math.random()*18)+2);
		for (int i =1; i<=19; i++) {
			System.out.printf("%d x %d = %d\n", num , i, num*i);
		}
	}

}
