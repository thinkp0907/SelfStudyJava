package sec01.exam05;

public class SmartPhone {
	// �ʵ�
	private String company;
	private String os;
	
	// ������
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	
	// �޼ҵ�
	
	public String whatIfTwo() {
		return company + " ~" + os;
	}
	
	@Override
	public String toString() {
		return company + " , " + os;
	}
	
	
}