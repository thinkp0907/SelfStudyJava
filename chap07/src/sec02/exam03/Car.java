package sec02.exam03;

public class Car {
	// �ʵ�
	Tire frontLeftTire = new Tire("frontLeft", 6);
	Tire frontRightTire = new Tire("frontRight", 2);
	Tire backLeftTire = new Tire("backLeft", 3);
	Tire backRightTire = new Tire("backRight", 4);
	
	// ������
	
	
	// �޼ҵ�
	public int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		if (!frontLeftTire.roll()) { stop();  return 1; }
		if (!frontRightTire.roll()) {stop();  return 2; }
		if (!backLeftTire.roll()) { stop(); return 3;}
		if (!backRightTire.roll()) {stop(); return 4;}
		return 0;
	}
	
	void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
