package sec02.exam03;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		
		for (int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch(problemLocation) {
			case 1:
				System.out.println("앞왼쪽 HankookTire로 교체");
				car.frontLeftTire = new HankookTire("frontLeft", 15);
				break;
			case 2:
				System.out.println("앞오른쪽 KumhoTire로 교체");
				car.frontRightTire = new KumhoTire("frontRight", 13);
				break;
			case 3:
				System.out.println("뒤왼쪽 HankookTire로 교체");
				car.backLeftTire = new HankookTire("backLeft", 14);
				break;
			case 4:
				System.out.println("뒤오른쪽 KumhoTire로 교체");
				car.backRightTire = new KumhoTire("backRight", 17);
				break;
			}
			System.out.println("-------------------------------------");
		}
	}
}
