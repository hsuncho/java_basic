package oop.abs.bad;

public class SeoulStore extends HeadStore{

	@Override
	public void orderApple() {
		System.out.println("사과주스의 가격은 3000원입니다.");
	}
	
	public void orderBANANA() {
		System.out.println("바나나주스의 가격은 2800원입니다.");
	}
	
}
