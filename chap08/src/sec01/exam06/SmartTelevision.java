package sec01.exam06;

public class SmartTelevision implements RemoteControl, Searchable{
	// �ʵ�
	private int volume;
	
	// ������
	
	// �޼ҵ�
	// RemoteControl �������̽� �߻� �޼ҽ� ��üȭ
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ����: " + this.volume);
	}
	
	
	// Searchable �������̽� �߻� �޼ҵ� ��üȭ
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}