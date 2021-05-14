package sec02.exam04;

public class Driver {
	// 필드
	
	// 생성자
	
	// 메소드
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
