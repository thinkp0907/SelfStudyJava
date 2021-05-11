package sec06.exam05.package2;						// A클래스와 다른 패키지

import sec06.exam05.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;								// 가능: public 접근 제한 - 다른 패키지에서도 자유롭게 사용가능
		a.field2 = 1;								// 불가능: default 접근 제한 - 같은 패키지에서만 사용가능
		a.field3 = 1;								// 불가능: private 접근 제한 - A클래스 내부에서만 사용가능
		
		a.method1();								// 가능: public 접근 제한 - 다른 패키지에서도 자유롭게 사용가능
		a.method2();								// 불가능: default 접근 제한 - 같은 패키지에서만 사용가능
		a.method3();								// 불가능: private 접근 제한 - A클래스 내부에서만 사용가능
	}
}
