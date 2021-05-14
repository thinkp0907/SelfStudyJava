package sec02.example;

public class MySqlDao implements DataAccessObject{
	// 필드
	
	// 생성자
	
	// 메소드
	@Override
	public void select() {
		System.out.println("MySql DB에서 검색");
	}
	@Override
	public void insert() {
		System.out.println("mySql DB에 삽입");
	}
	
	@Override
	public void update() {
		System.out.println("mySql DB에 수정");
	}
	
	@Override
	public void delete() {
		System.out.println("mySql DB에서 삭제");
	}
}
