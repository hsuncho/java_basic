package etc.api.lang.wrapper;
import java.util.Scanner;

public class ParseQuiz {

	public static void main(String[] args) {


//		주민등록번호를 입력받아서 다음과 같은 정보를 추출하여 출력합니다.
//
//		ex) 입력값: 921013-1234567
//		출력값: 1992년 10월 13일 31세 남자 
//
//		입력값: 040906-4123456
//		출력값: 2004년 9월 6일 19세 여자 
//
//		입력값은 하이픈이 포함된 문자열이어야 합니다. 
//		하이픈이 포함되어 있지 않거나, 주민등록번호 뒷자리 첫번째 숫자가 1,2,3,4가 아닐 시에는 다시 입력받아야 합니다.
//		또한 하이픈을 제외한 값이 숫자가 아닐 시에도 다시 입력받아 주시면 됩니다.
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("주민등록번호를 입력하세요: ");
			String socNum = sc.next();
			
			char chkGen = socNum.charAt(7);
			int year = Integer.parseInt(socNum.substring(0,2));
			int month = Integer.parseInt(socNum.substring(2,4));
			int day = Integer.parseInt(socNum.substring(4,6));
			
			
			if(socNum.length()!=14) {
				System.out.println("총 14자를 입력해주십시오.");
			} else if(socNum.charAt(6)!='-') {
				System.out.println("하이픈(-)을 포함하여 다시 입력하십시오");
			} else if((chkGen <'1') || (chkGen > '4')) {
				System.out.println("주민등록번호 뒷자리 첫번째 숫자를 다시 입력하십시오.");
			} else {
				if(socNum.charAt(0) == '0') {
					year += 2000;
				} else {
					year += 1900;
				}
				
				
				String gender = (chkGen =='1' || chkGen =='3')? "남성" : "여성";
							
				System.out.printf("%s년 %d월 %d일 %d세 %s", year,month, day, (2023-year),gender);
				break;
			}
			
		}
		sc.close();
	}

}
