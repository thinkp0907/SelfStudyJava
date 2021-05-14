package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare()				// 인터페이스 타입으로 변환된 상태이므로 Bus 클래스에 checkFare method 사용 불가능
		
		Bus bus = (Bus) vehicle;			// Bus 클래스에 메소드를 사용하기 위해서는 다시 Bus클래스 타입으로 강제 변환 후 사용.
		
		bus.run();
		bus.checkFare();
	}

}
