package etc.api.collection.list;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {

		LinkedList<String> list = new LinkedList<>();
		
		//추가
		list.add("홍길동");
		list.add("김철수");
		list.add("박영희");
		
		list.addFirst("맨 앞");
		list.addLast("맨 뒤");
		System.out.println(list);
		
		System.out.println(list.get(3));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		//실제로 메모리에는 그 다음값의 주소값
		
		list.remove(0);
		System.out.println(list);
		
		//LIFO -> last in first out -> stack
		//push, pop, peek
		list.push("김뽀삐"); //앞에서부터 추가
		System.out.println(list);
		
		//삭세하면서 데이터를 읽기
		System.out.println(list.pop()); //데이터가 뽑혀 나오면서 실제 리스트의 값이 삭제됨
		System.out.println(list);
		
		//삭제하지 않으면서 읽기
		System.out.println(list.peek());
		System.out.println(list);
		
		//FIFO -> first in first out -> Queue
		//offer, poll, peek
		list.offer("a");
		list.offer("b");
		list.offer("c");
		System.out.println(list);
		
		System.out.println(list.poll()); //먼저 들어온 게 먼저 나감
		System.out.println(list);
		
		System.out.println(list.peek());
		System.out.println(list);

	}

}
