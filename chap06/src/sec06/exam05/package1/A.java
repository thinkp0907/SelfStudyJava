package sec06.exam05.package1;

public class A {
	// �ʵ�
	public int field1;				// public ��������
	int field2;						// default ��������
	private int field3;				// private ��������
	
	// ������
	public A() {
		field1 = 1;					// ����: Ŭ���� ���ο����� ���� ���� ���� x
		field2 = 1;					// ����: Ŭ���� ���ο����� ���� ���� ���� x
		field3 = 1;					// ����: Ŭ���� ���ο����� ���� ���� ���� x
		
		method1();					// ����: Ŭ���� ���ο����� ���� ���� ���� x
		method2();					// ����: Ŭ���� ���ο����� ���� ���� ���� x
		method3();					// ����: Ŭ���� ���ο����� ���� ���� ���� x
	}
	
	// �޼ҵ�
	public void method1() {}		// public ��������
	void method2() {}				// default ��������
	private void method3() {}		// private ��������
}
