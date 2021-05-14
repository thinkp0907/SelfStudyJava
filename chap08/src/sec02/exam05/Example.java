package sec02.exam05;

public class Example {

	public static void main(String[] args) {
		Implementation c = new Implementation();
		
		InterfaceA ia = c;
		ia.methodA();
		System.out.println();			// InterfaceA 변수 ia는 methodA() 메소드만 호출가능
		
		InterfaceB ib = c;
		ib.methodB();
		System.out.println();			// InterfaceB 변수 ib는 methodB() 메소드만 호출가능
		
		InterfaceC ic = c;				
		ic.methodA();					
		ic.methodB();					// InterfaceC 인터페이서는 InterfaceA, InterfaceB 인터페이스를 상속했기 때문에
		ic.methodC();					// InterfaceC 변수 ic는 methodA, methodB, methodC 모두 호출가능
	}

}
