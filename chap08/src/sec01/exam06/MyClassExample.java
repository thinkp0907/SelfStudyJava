package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)--------------------");
		
		MyClass myClass = new MyClass();
		myClass.rc.turnOn();						// RemoteContrl rc = new Television �ʵ�� ���� rc�� �����Ͽ� Television ��� ���
		myClass.rc.setVolume(5);					// TV�� �մϴ�. ���� TV ����: 5
		
		System.out.println("2)--------------------");
		
		MyClass myClass2 = new MyClass(new Audio());	// RemoteControl rc�� �Ű������� �޴� �����ڿ� new Audio ��ü�� �Ű��� Audio ��� ���
		// Audios�� �մϴ�. ���� Audio ����: 5
		
		
		System.out.println("3)--------------------");
		MyClass myClass3 = new MyClass(); 
		myClass3.methodA();							// Audio�� �մϴ�. ���� Audio ����: 5
		
		System.out.println("4)--------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());			// TV�� �մϴ�. ���� TV ����: 5
	}

}
