package sec01.exam01;



public class A {
	
	/** �ٱ� Ŭ���� **/
	// ������
	A() {
		System.out.println("A ��ü�� ������");
	}
	
	
	/** �ν��Ͻ� ��� Ŭ���� **/
	class B {
		// �ʵ�
		int field1;
		// static int field2;
		
		// ������
		B() {
			System.out.println("B ��ü�� ������");
		}
		
		// �޼ҵ�
		void method1() {}
		// static void mehtod2() {}
	}
	
	
	/** ���� ��� Ŭ���� **/
	static class C {
		// �ʵ�
		int field1;
		static int field2;
		
		// ������
		C() {
			System.out.println("C ��ü�� ������");
		}
		
		// �޼ҵ�
		void method1() {}
		static void method2() {}
	}
	
	void method() {
		/** ���� Ŭ����**/
		class D {
			// �ʵ�
			int field1;
			// static int field2;
			//������
			D() {
				System.out.println("D ��ü�� ������");
			}
			
			// �޼ҵ�
			void method1() {}
			// static void method2() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
		
		
	}
}
