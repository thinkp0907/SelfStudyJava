package sec01.exam01;

public class Member {
	// �ʵ�
	public String id;
	
	// ������
	public Member(String id) {
		this.id = id;
	}
	
	
	// �޼ҵ� (������)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
