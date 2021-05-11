package sec06.exam05.package1;					// A클래스와 패키지 동이

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;							// 가능: public 접근 제한 - 같은 패키지에서 사용가능
		a.field2 = 1;							// 가능: default 접근 제한 - 같은 패키지에서 사용가능
		a.field3 = 1;							// 불가능: private 접근 제한 - A클래스 내부에서만 사용가능
		
		a.method1();							// 가능: public 접근 제한 - 같은 패키지에서 사용가능
		a.method2();							// 가능: default 접근 제한 - 같은 패키지에서 사용가능
		a.method3();							// 불가능: private 접근 제한 - A클래스 내부에서만 사용가능
	}
}
