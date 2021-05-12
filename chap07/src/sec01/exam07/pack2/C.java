package sec01.exam07.pack2;

import sec01.exam07.pack1.*;

public class C {
	public void mehtod() {
		A a = new A();
		a.field = "value";				// protected로 선언된 필드, 생성자, 메소드는 다른 패키지에서 접근 불가
		a.method();
		
	}
}
