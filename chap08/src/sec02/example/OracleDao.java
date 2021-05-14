package sec02.example;

public class OracleDao implements DataAccessObject{
	// 필드
	
	// 생성자
	
	// 메소드
	@Override
	public void select() {
		System.out.println("OracleDB에서 검색");
	}
	
	@Override
	public void insert() {
		System.out.println("OracleDB에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("OracleDB를 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("OracleDB에서 삭제");
	}
}
