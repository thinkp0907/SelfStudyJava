package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() { speed += 10 };
	
	@Override
	public void stop() {					// CarŬ�������� stop()�޼ҵ�� fianl�� ���� �Ǿ� �������� �ڽ� Ŭ�������� ������ �� �� ����.
		System.out.println("������ī�� ����");
		speed = 0;
	}
}
