package basic.operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {

//		System.out.println(397+42);
		int rn = (int) ((Math.random()*439)-42);
		System.out.println(rn);
		String str = (rn % 2==0?"짝수입니다.": "홀수입니다.");
		System.out.println("3항 연산의 결과: "+str);
		
	}

}
