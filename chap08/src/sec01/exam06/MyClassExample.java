package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)--------------------");
		
		MyClass myClass = new MyClass();
		myClass.rc.turnOn();						// RemoteContrl rc = new Television 필드로 사용된 rc에 접근하여 Television 기능 사용
		myClass.rc.setVolume(5);					// TV를 켭니다. 현재 TV 볼륨: 5
		
		System.out.println("2)--------------------");
		
		MyClass myClass2 = new MyClass(new Audio());	// RemoteControl rc를 매개변수로 받는 생성자에 new Audio 객체를 매개로 Audio 기능 사용
		// Audios를 켭니다. 현재 Audio 볼륨: 5
		
		
		System.out.println("3)--------------------");
		MyClass myClass3 = new MyClass(); 
		myClass3.methodA();							// Audio를 켭니다. 현재 Audio 볼륨: 5
		
		System.out.println("4)--------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());			// TV를 켭니다. 현재 TV 볼륨: 5
	}

}
