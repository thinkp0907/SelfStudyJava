package sec01.exam02;

public class A {
	// �ν��Ͻ� �ʵ�
	B field = new B();
	C field2 = new C();
	
	// �ν��Ͻ� �޼ҵ�
	public void method1() { 
		B var1 = new B();
		C var2 = new C();
	}
	
	// ���� �ʵ�
//	static B field3 = new B();
	static C field4 = new C();
	
	// ���� �޼ҵ�
	public static void method2() {
//		B var3 = new B();
		C var4 = new C();
	}
	
	// �ν��Ͻ� ��� Ŭ����
	class B {}
	
	// ���� ��� Ŭ����
	static class C {}
}
