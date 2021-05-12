package sec01.exam06;

public class SportsCar extends Car {
	@Override
	public void speedUp() { speed += 10 };
	
	@Override
	public void stop() {					// Car클래스에서 stop()메소드는 fianl로 정의 되어 있음으로 자식 클래스에서 재정의 될 수 없음.
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
