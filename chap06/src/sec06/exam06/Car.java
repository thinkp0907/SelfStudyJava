package sec06.exam06;

public class Car {
	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	// 메소드
	// Getter
	public int getSpeed() {
		return speed;
	}
	
	// Setter
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	// boolean Getter
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
