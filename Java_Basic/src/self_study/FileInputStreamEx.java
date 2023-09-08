package self_study;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileInputStreamEx {

	public static void main(String[] args) {

		FileReader fr =null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			fr = new FileReader("C:/Mywork/Personal_Info.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("C:/Mywork/Phone.txt");
			bw = new BufferedWriter(fw);

			List<String> arr = new ArrayList<>();

			String str;
			while((str = br.readLine())!=null) {
//				System.out.println(str);
				if(str.contains("Phone")) {
					arr.add(str);
				}
			}
			System.out.println(arr);
			String[] numArr = new String[arr.size()*3];
			String num;

			for(int i=0; i<arr.size();i++) {
				num = arr.get(i).replace("Phone: ", "");
				System.out.println(num);
				
				numArr[i] = num.split("-")[0];
				numArr[i] = num.split("-")[1];
				numArr[i] = num.split("-")[2];
			}
			System.out.print(Arrays.toString(numArr));

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}
