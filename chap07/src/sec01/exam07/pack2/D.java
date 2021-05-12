package sec01.exam07.pack2;

import sec01.exam07.pack1.*;

public class D extends A{
	public D() {
		super();
		this.field = "value";		// protected로 선언된 필드, 생성자, 메소드는 다른 패키지에 있더라도 상속받는 자식이라면 접근 가능.
		this.method();				// 단 new 연산자를 사용해서 생성자를 직접 호출할 수는 없고, 자식 생성자에서 super()로 A 생성자를 호출 가능.
	}
}
