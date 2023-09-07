package self_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {

		String str = "Once upon a time, there was a young man named Jack who lived in a small village. He was a \r\n"
				+ "curious and adventurous person who loved exploring the world around him. One day, he \r\n"
				+ "decided to set out on a journey to find the legendary treasure that was said to be hidden in \r\n"
				+ "the nearby mountains.\r\n"
				+ "As he made his way up the mountain, he encountered many obstacles and challenges. He \r\n"
				+ "had to climb steep cliffs, cross raging rivers, and navigate through dense forests. But he never \r\n"
				+ "gave up, and he kept pushing himself to reach his goal.\r\n"
				+ "On the third day of his journey, he came across an old man who was sitting by the side of \r\n"
				+ "the road. The man had a long white beard and was dressed in tattered robes. \"He who seeks \r\n"
				+ "the treasure must first answer my riddle.\", he looked up as Jack approached and said.\r\n"
				+ "";
		List<String[]> stringList = new ArrayList<>();
		
//		System.out.println(str.replace(",", "").replace(".", "").replace("\"", ""));
		String[] newStr = str.replace(",", "")
							.replace(".", "")
							.replace("\"", "")
							.split(" ");
		stringList.add(newStr);
//		System.out.println(Arrays.toString(newStr));
		System.out.println(newStr.length);
		
		Set<String> stringSet = new HashSet<>();
		Collections.addAll(stringSet,newStr);
		System.out.println(stringSet);
		System.out.println(stringSet.size());
		
		List<String> s= new ArrayList<>(stringSet);
		
//		System.out.println(Collections.sort(s));
		
	}

}
