package sec01.exam01;

public class DmbCellPhone extends CellPhone{
	// �ʵ�
	int channel;
	
	
	
	// ������
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;				// CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.color = color;				// CellPhone Ŭ�����κ��� ��ӹ��� �ʵ�
		this.channel = channel;
	}
	
	
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�. ");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
	
}
