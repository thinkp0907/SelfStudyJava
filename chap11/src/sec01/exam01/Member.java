package sec01.exam01;

public class Member {
	// 필드
	public String id;
	
	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	
	// 메소드 (재정의)
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
