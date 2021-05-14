package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	
	class B {
		void method() {
			method1();
			field1 = 3;
			
			method2();
			field2 = 3;
		}
		}
	
	static class C {
		void method() {
//			method1();
//			field1 = 3;
			
			method2();
			field2 = 3;
		}
		
		
	}
}
