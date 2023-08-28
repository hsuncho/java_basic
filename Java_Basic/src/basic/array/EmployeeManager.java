package basic.array;

import java.util.Scanner;

public class EmployeeManager {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      // 사원의 정보: 사번, 이름, 나이, 부서명
      String[] userNums = new String[100];
      String[] names = new String[100];
      int[] ages = new int[100];
      String[] departments = new String[100];
      
      boolean flag = false;
      int count = 0; // 실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
      
      main : while (true) {
         System.out.println("\n========== 사원 관리 프로그램 ==========");
         System.out.println("# 1. 사원 정보 신규 등록");
         System.out.println("# 2. 모든 사원 정보 보기");
         System.out.println("# 3. 사원 정보 검색");
         System.out.println("# 4. 사원 정보 수정");
         System.out.println("# 5. 사원 정보 삭제");
         System.out.println("# 6. 프로그램 종료");
         System.out.println("====================================");
         
         System.out.print("> ");
         int menu = sc.nextInt();
         System.out.println(menu);
         switch (menu) {
         
         case 1: {
            // 사원의 정보: 사번, 이름, 나이, 부서명
            // 사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
            // 사번은 중복되면 안됩니다.
            // (무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
            while (true) {
               System.out.print("사번을 입력하세요: ");
               String userNum = sc.next();
               
               boolean duplication = false;
               
               for (int i = 0; i < count; i++) {
                  if (userNum.equals(userNums[i])) {
                     duplication = true;
                     break;
                  }
               }
               if (!duplication) { // 중복되지 않은 경우
                  userNums[count] = userNum;
                  
                  System.out.print("이름을 입력하세요: ");
                  names[count] = sc.next();
                  
                  System.out.print("나이를 입력하세요: ");
                  ages[count] = sc.nextInt();
                  
                  System.out.print("부서명을 입력하세요: ");
                  departments[count] = sc.next();
                  
                        count++; // 데이터 개수 증가
                        
                        break; // 무한루프 종료
                    } else { // 중복된 경우
                        System.err.println("중복된 사번입니다. 다시 입력해주세요.");
                    }
                }
                break;
         } 
         case 2:
            // 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
            // 만약 사용자가 사원 등록을 한 명도 하지 않았다면
            // "등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
             if (count == 0) {
                 System.out.println("등록된 사원 정보가 없습니다.");
             } else {
                 // 각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성.
                 for (int i = 0; i < count; i++) {
                     System.out.println("사번: " + userNums[i]);
                     System.out.println("이름: " + names[i]);
                     System.out.println("나이: " + ages[i]);
                     System.out.println("부서명: " + departments[i]);
                     System.out.println();
                 }
             }
             break;

         case 3:
            // 입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
            // 입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
            System.out.print("사번을 입력하세요 : ");
            String userNum1 = sc.next();
            for (int i = 0; i <= count; i++) {
               if(userNum1.equals(userNums[i])){
                  // 사원의 정보: 사번, 이름, 나이, 부서명
                  System.out.printf("사번 : %s 이름 : %s 나이 : %d 부서명 : %s \n",userNums[i],names[i],ages[i],departments[i] );
                  continue main;
               }else if(!userNum1.equals(userNums[i])){
                  System.out.println("조회하신 사원의 정보가 없습니다.");
                  continue main;
               }
            }
         case 4:
            // 해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
            // 프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
            // 사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
            // 사번이 존재하지 않는다면 없다고 얘기해 주세요.
            System.out.print("사번을 입력하세요 : ");
            String userNum2 = sc.next();
            for (int i = 0; i <= count; i++) {
               if(userNum2.equals(userNums[i])){
                  // 사원의 정보: 사번, 이름, 나이, 부서명
                  System.out.printf("사번 : %s 이름 : %s 나이 : %d 부서명 : %s \n",userNums[i],names[i],ages[i],departments[i] );
                  System.out.print("나이와 부서를 수정할 수 있습니다.\n 수정하고 싶은 번호를 입력하세요 \n[1. 나이변경 | 2. 부서변경 | 3.취소]\n >");
                  int chgmenu = sc.nextInt();
                  switch (chgmenu) {
                    case 1:
                        System.out.print("변경할 나이를 입력하세요: ");
                        int newAge = sc.nextInt();
                        ages[i] = newAge;
                        System.out.println("나이가 변경되었습니다.");
                        continue main;
                        
                    case 2:
                        System.out.print("변경할 부서명을 입력하세요: ");
                        String newDepartment = sc.next();
                        departments[i] = newDepartment;
                        System.out.println("부서명이 변경되었습니다.");
                        continue main;
                        
                    case 3:
                       System.out.println("취소되었습니다.");
                       continue main;

                    default:
                       System.err.println("잘못된 선택입니다.");
                       break;
               }
               break;
               }else if(i == count){
                  System.out.println("조회하신 사원의 정보가 없습니다.");
                  continue main;
               }
            }
         case 5:
            // 사번을 입력받아서
            // 해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
            // 삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
            // y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
            // 배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
            // 앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
            System.out.print("사번을 입력하세요: ");
            String userNum5 = sc.next();

            int idex = 0;

            for (int i=0; i<count; i++) {
               if(userNum5.equals(userNums[i])) {
                  idex=i;
                  break;
               }else {
                  System.err.println("조회하신 사원의 정보가 없습니다.");
                  break;
               }
            }
            System.out.print("[Y/N] 정말 삭제하시겠습니까? : ");
            String YesDelete=sc.next();

            if(YesDelete.equals("Y")) { // 대소문자 구분하지 않고 'Y'인 경우에만 삭제
                for(int j=idex;j<count-1;j++) { 
                    userNums[j]=userNums[j+1];
                    names[j]=names[j+1];
                    ages[j]=ages[j+1];
                    departments[j]=departments[j+1];
                }
                
                count--; // 데이터 개수 감소
                
                System.out.println("사원 정보가 삭제되었습니다.");   
            } else {
                System.err.println("삭제가 취소되었습니다.");   
            }
            
            break;

         case 6: {
            System.out.println("사원정보 : " + count);
            System.out.println("프로그램을 종료합니다.");
            return; // while true break
         }
         default:
            System.err.println("메뉴를 잘못 입력 하셨습니다.");
         }
      }
   }
}