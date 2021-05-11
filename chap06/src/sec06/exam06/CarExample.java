package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		// 잘못된 속도 변경
		myCar.setSpeed(-50);
		
		System.out.println("현재 속도: " + myCar.getSpeed());			// 0
		
		// 올바른 속도 변경
		myCar.setSpeed(60);
		
		System.out.println("현재 속도: " + myCar.getSpeed());			// 60
		
		// 멈춤
		if(!myCar.isStop()) {				// stop = false => !myCar.isStop() 이후는 true 로 바뀜
			myCar.setStop(true);			// stop = true로 바뀌고, speed = 0으로 초기화.
		}
		
		System.out.println("현재 속도: " + myCar.getSpeed());			// 0
		
	}

}
