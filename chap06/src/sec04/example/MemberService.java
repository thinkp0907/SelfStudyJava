package sec04.example;

public class MemberService {
	// �ʵ�
	String id = "hong";
	String password = "12345";
	// ������
	
	// �޼ҵ�
	
	boolean login(String id, String password) {
		if ((this.id.equals(id)) && (this.password.equals(password))) {
			return true;
		} else {
			return false;
		}
	}
	
	void logout(String id) {
		if(this.id.equals(id)) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	}
}
