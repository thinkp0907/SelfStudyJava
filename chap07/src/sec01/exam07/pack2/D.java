package sec01.exam07.pack2;

import sec01.exam07.pack1.*;

public class D extends A{
	public D() {
		super();
		this.field = "value";		// protected�� ����� �ʵ�, ������, �޼ҵ�� �ٸ� ��Ű���� �ִ��� ��ӹ޴� �ڽ��̶�� ���� ����.
		this.method();				// �� new �����ڸ� ����ؼ� �����ڸ� ���� ȣ���� ���� ����, �ڽ� �����ڿ��� super()�� A �����ڸ� ȣ�� ����.
	}
}
