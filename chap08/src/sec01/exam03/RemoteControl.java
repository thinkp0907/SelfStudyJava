package sec01.exam03;

public interface RemoteControl {
	// ��� �ʵ�
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
