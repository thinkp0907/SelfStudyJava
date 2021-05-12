package sec02.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		
		parent.method1();
		parent.method2();				// Child클래스에서 재정의 된 method2가 호출됨
//		parent.method3();
	}
}
