package sec06.exam04.package1;

public class B {
	// 필드
	A a1 = new A(true);			// 가능: public 접근제한 - A클래스와 같은 패키지
	A a2 = new A(1);			// 가능: default 접근제한 - A클래스와 같은 패키지
//	A a3 = new A("문자열");		// 불가능: private 접근제한 - A클래스 내부에서만 사용가능한 접근 제한
}
