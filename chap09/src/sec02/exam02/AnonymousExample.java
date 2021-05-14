package sec02.exam02;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.rc.turnOn();
		anony.rc.turnOff();
		
		anony.method1();
	
		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("스마트TV를 켭니다.");
			}
			@Override
			public void turnOff() {
				System.out.println("스마트TV를 끕니다.");
			}
		});
	}

}
