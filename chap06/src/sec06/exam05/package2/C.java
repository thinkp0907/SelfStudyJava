package sec06.exam05.package2;						// AŬ������ �ٸ� ��Ű��

import sec06.exam05.package1.*;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;								// ����: public ���� ���� - �ٸ� ��Ű�������� �����Ӱ� ��밡��
		a.field2 = 1;								// �Ұ���: default ���� ���� - ���� ��Ű�������� ��밡��
		a.field3 = 1;								// �Ұ���: private ���� ���� - AŬ���� ���ο����� ��밡��
		
		a.method1();								// ����: public ���� ���� - �ٸ� ��Ű�������� �����Ӱ� ��밡��
		a.method2();								// �Ұ���: default ���� ���� - ���� ��Ű�������� ��밡��
		a.method3();								// �Ұ���: private ���� ���� - AŬ���� ���ο����� ��밡��
	}
}
