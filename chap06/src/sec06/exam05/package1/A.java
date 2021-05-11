package sec06.exam05.package1;

public class A {
	// 필드
	public int field1;				// public 접근제한
	int field2;						// default 접근제한
	private int field3;				// private 접근제한
	
	// 생성자
	public A() {
		field1 = 1;					// 가능: 클래스 내부에서는 접근 제한 영향 x
		field2 = 1;					// 가능: 클래스 내부에서는 접근 제한 영향 x
		field3 = 1;					// 가능: 클래스 내부에서는 접근 제한 영향 x
		
		method1();					// 가능: 클래스 내부에서는 접근 제한 영향 x
		method2();					// 가능: 클래스 내부에서는 접근 제한 영향 x
		method3();					// 가능: 클래스 내부에서는 접근 제한 영향 x
	}
	
	// 메소드
	public void method1() {}		// public 접근제한
	void method2() {}				// default 접근제한
	private void method3() {}		// private 접근제한
}
