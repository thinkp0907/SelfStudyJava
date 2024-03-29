package sec01.exam01;



public class A {
	
	/** 바깥 클래스 **/
	// 생성자
	A() {
		System.out.println("A 객체가 생성됨");
	}
	
	
	/** 인스턴스 멤버 클래스 **/
	class B {
		// 필드
		int field1;
		// static int field2;
		
		// 생성자
		B() {
			System.out.println("B 객체가 생성됨");
		}
		
		// 메소드
		void method1() {}
		// static void mehtod2() {}
	}
	
	
	/** 정적 멤버 클래스 **/
	static class C {
		// 필드
		int field1;
		static int field2;
		
		// 생성자
		C() {
			System.out.println("C 객체가 생성됨");
		}
		
		// 메소드
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/** 로컬 클래스**/
		class D {
			// 필드
			int field1;
			// static int field2;
			//생성자
			D() {
				System.out.println("D 객체가 생성됨");
			}
			
			// 메소드
			void method1() {}
			// static void method2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		
		
	}
}
