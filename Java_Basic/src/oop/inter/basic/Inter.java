package oop.inter.basic;

// 인터페이스: 객체의 규격(기능)을 표준화해서 명세하는 역할
// 클래스의 틀을 만든다(~식으로 만들 거야)
public interface Inter extends ParentInter {
	
	//인터페이스에서 변수를 선언하면 상수(static final)로 지정합니다.
	int NUM =5;
	
//	Inter(){} (x)
	// 인터페이스는 객체 생성을 위한 것이 아님
	// 인터페이스는 생성자를 가질 수 없습니다. (객체화 될 수 없는 개념입니다.)
	
	//인터페이스에서 메서드를 선언하면 추상 메서드로 지정됩니다.
	void method1();
	
	public static void staticMethod() {
		System.out.println("가능합니다~");
	} //객체에 저장되는 메서드가 아니기때문에 가능
	//인터페이스는 데이터 저장을 위한 공간이 아님
	//선언되는 곳에 이름은 빌려줄 수 있음
}