package self_study;

import java.util.Scanner;

public class constate {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("A를 입력하세요: ");
		int A = sc.nextInt();
		System.out.print("B를 입력하세요: ");
		int B = sc.nextInt();
		if (A>B) {
			System.out.println(A+" > "+B);
		} else if(A==B) {
			System.out.println(A+" = "+B);
		} else if (A<B) {
			System.out.println(A+" < "+B);
		}
		
		
	}

}
