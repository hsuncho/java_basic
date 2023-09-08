package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BufferedQuiz {

	public static void main(String[] args) {

		/*
        1. LocalDate클래스를 이용해서 file폴더 내에 하위 경로로
         오늘 날짜 20230908file 이라는 이름으로 폴더를 생성하세요.
        2. 스캐너로 파일명을 입력받고 파일명.txt로 파일을 쓸 겁니다.
        3. '그만' 이라고 입력할 때까지 엔터를 포함해서 실시간으로
         파일을 작성합니다.
         (변수를 하나 선언해서 사용자의 입력값을 계속 누적시켜서 
          연결해 주시면 됩니다.)
               각 문장은 줄 개행을 포함합니다.
        4. '그만'으로 파일이 작성되었다면, 아무 방법으로나 
         파일을 읽어서 콘솔에 출력해 보세요.
		 */

		LocalDate date = LocalDate.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

		File file = new File("C:/Mywork/file/"+date.format(dtf)+"file");

		if(!file.exists()) {
			file.mkdirs();
		}

		Scanner sc = new Scanner(System.in);
		System.out.print("파일명: ");
		String fileName = sc.next();
		sc.nextLine();

		BufferedWriter bw = null;
		BufferedReader br = null;

		try {
			bw = new BufferedWriter(new FileWriter(file+"/"+fileName+".txt"));	

			while(true) {
				System.out.print("내용을 입력해주십시오: ");
				String str1 = sc.nextLine();
				if(str1.equals("그만")) break;
				bw.write(str1+"\r\n");
			}
			System.out.println("파일 정상 출력 완료!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			br = new BufferedReader(new FileReader(file+"/"+fileName+".txt"));
			String str;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				sc.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}


}

