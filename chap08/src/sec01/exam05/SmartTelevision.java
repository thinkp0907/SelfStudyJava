package sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable{
	// 필드
	private int volume;
	
	// 생성자
	
	// 메소드
	// RemoteControl 인터페이스 추상 메소스 실체화
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	
	// Searchable 인터페이스 추상 메소드 실체화
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
