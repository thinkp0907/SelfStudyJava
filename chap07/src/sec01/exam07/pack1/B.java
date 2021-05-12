package sec01.exam07.pack1;

public class B {
	public void method() {
		A a = new A();
		a.field = "value";					// 같은 패키지 접근 가능.
		a.mehtod();
	}
}
