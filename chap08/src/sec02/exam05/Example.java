package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		Implementation c = new Implementation();
		
		InterfaceA ia = c;
		ia.methodA();
		System.out.println();			// InterfaceA ���� ia�� methodA() �޼ҵ常 ȣ�Ⱑ��
		
		InterfaceB ib = c;
		ib.methodB();
		System.out.println();			// InterfaceB ���� ib�� methodB() �޼ҵ常 ȣ�Ⱑ��
		
		InterfaceC ic = c;				
		ic.methodA();					
		ic.methodB();					// InterfaceC �������̼��� InterfaceA, InterfaceB �������̽��� ����߱� ������
		ic.methodC();					// InterfaceC ���� ic�� methodA, methodB, methodC ��� ȣ�Ⱑ��
	}

}
