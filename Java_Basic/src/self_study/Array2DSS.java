package self_study;

import java.util.Arrays;

public class Array2DSS {

	public static void main(String[] args) {

		//3행 4열의 배열을 선언하고 12개의 배열에 1~12 숫자 채우기
		
		int[][] arr = new int[3][4]; // 3행 4열의 2차원 배열 선언
		System.out.println(Arrays.deepToString(arr));
		
		arr[1][2] = 50;
		arr[2][1] = 50;
		
		System.out.println(Arrays.deepToString(arr));

		/*
        1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
        2. 각 과목의 평균을 출력해 보세요.
        3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
        */
		
		int[][] score = {
                {79, 80, 99}, //A학생
                {95, 85, 89}, //B학생
                {90, 65, 56}, //C학생
                {69, 78, 77}  //D학생
                //과목: 3과목
        };
        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};
        
        //1번
        int idx =0; // 학생 인덱스 부여
        for (int[] eachStu : score) {
        	int sum = 0;
        	for(int n : eachStu) {
        		sum += n;
        	}
        	double avg = (double)sum/stuName.length;
        	System.out.printf("%s의 평균점수: %.1f점\n",stuName[idx], avg);
        	idx++;
        }
        System.out.println("----------------");
      //2번
	}
}
        
        
        
				
			
		
		



