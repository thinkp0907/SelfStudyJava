package sec01.exam05;

public class SmartPhone {
	// 필드
	private String company;
	private String os;
	
	// 생성자
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	
	// 메소드
	
	public String whatIfTwo() {
		return company + " ~" + os;
	}
	
	@Override
	public String toString() {
		return company + " , " + os;
	}
	
	
}
