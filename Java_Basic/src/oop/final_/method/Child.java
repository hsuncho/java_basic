package oop.final_.method;

public class Child extends Parent{

	@Override
	void method1() {
		super.method1();
	}

	@Override
	void method2() {
		super.method2();
	}

//	void method3() {
//	System.out.println("오버라이딩 해야지");
//	} (x) -> final 메서드는 오버라이딩을 막습니다. (물려주는대로 써라)
//

}
