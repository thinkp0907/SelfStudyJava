package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// �߸��� �ӵ� ����
		myCar.setSpeed(-50);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());			// 0
		
		// �ùٸ� �ӵ� ����
		myCar.setSpeed(60);
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());			// 60
		
		// ����
		if(!myCar.isStop()) {				// stop = false => !myCar.isStop() ���Ĵ� true �� �ٲ�
			myCar.setStop(true);			// stop = true�� �ٲ��, speed = 0���� �ʱ�ȭ.
		}
		
		System.out.println("���� �ӵ�: " + myCar.getSpeed());			// 0
		
	}

}
