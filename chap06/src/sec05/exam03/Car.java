package sec05.exam03;

public class Car {
	// 필드
	// 인스턴스 필드
	int speed;
	
	
	// 생성자
	
	// 메소드
	// 인스턴스 메소드
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();					// main문에서도 인스턴스 필드 또는 인스턴스 메소드 사용하기 위해서 객체를 먼저 생성해야한다.
		myCar.speed = 60;
		myCar.run();
	}
}
