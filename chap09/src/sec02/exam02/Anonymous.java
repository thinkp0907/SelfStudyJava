package sec02.exam02;

public class Anonymous {
	// �ʵ� �ʱⰪ���� ����
	RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
	};
	
	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("������� �մϴ�.");
			}
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�.");
			}
		};
		
		localVar.turnOn();
		localVar.turnOff();
	}
	
	
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
