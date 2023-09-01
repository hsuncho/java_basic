package oop.abs.bad;

public class MainClass {

	public static void main(String[] args) {

		HeadStore store = new SeoulStore();
		//부모타입의 변수에 자식 객체의 주소값 적용
		store.orderApple();
		store.orderBanana();
		store.orderGrape();

	}

}











