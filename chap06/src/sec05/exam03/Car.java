package sec05.exam03;

public class Car {
	// �ʵ�
	// �ν��Ͻ� �ʵ�
	int speed;
	
	
	// ������
	
	// �޼ҵ�
	// �ν��Ͻ� �޼ҵ�
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();					// main�������� �ν��Ͻ� �ʵ� �Ǵ� �ν��Ͻ� �޼ҵ� ����ϱ� ���ؼ� ��ü�� ���� �����ؾ��Ѵ�.
		myCar.speed = 60;
		myCar.run();
	}
}
