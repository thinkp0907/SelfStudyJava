package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare()				// �������̽� Ÿ������ ��ȯ�� �����̹Ƿ� Bus Ŭ������ checkFare method ��� �Ұ���
		
		Bus bus = (Bus) vehicle;			// Bus Ŭ������ �޼ҵ带 ����ϱ� ���ؼ��� �ٽ� BusŬ���� Ÿ������ ���� ��ȯ �� ���.
		
		bus.run();
		bus.checkFare();
	}

}
