package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();			// �ѱ� Ÿ�̾ �������ϴ� x 4
		
		myCar.frontLeftTire = new KumhoTire();			
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();			// ��ȣ Ÿ�̾ �������ϴ� x2 | �ѱ� Ÿ�̾ �������ϴ� x2
	}

}
