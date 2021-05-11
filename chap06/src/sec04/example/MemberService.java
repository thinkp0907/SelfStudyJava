package sec04.example;

public class MemberService {
	// 필드
	String id = "hong";
	String password = "12345";
	// 생성자
	
	// 메소드
	
	boolean login(String id, String password) {
		if ((this.id.equals(id)) && (this.password.equals(password))) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		if(this.id.equals(id)) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
