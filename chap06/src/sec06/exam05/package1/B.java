package sec06.exam05.package1;					// AŬ������ ��Ű�� ����

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;							// ����: public ���� ���� - ���� ��Ű������ ��밡��
		a.field2 = 1;							// ����: default ���� ���� - ���� ��Ű������ ��밡��
		a.field3 = 1;							// �Ұ���: private ���� ���� - AŬ���� ���ο����� ��밡��
		
		a.method1();							// ����: public ���� ���� - ���� ��Ű������ ��밡��
		a.method2();							// ����: default ���� ���� - ���� ��Ű������ ��밡��
		a.method3();							// �Ұ���: private ���� ���� - AŬ���� ���ο����� ��밡��
	}
}
