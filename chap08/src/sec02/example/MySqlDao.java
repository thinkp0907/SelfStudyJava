package sec02.example;

public class MySqlDao implements DataAccessObject{
	// �ʵ�
	
	// ������
	
	// �޼ҵ�
	@Override
	public void select() {
		System.out.println("MySql DB���� �˻�");
	}
	@Override
	public void insert() {
		System.out.println("mySql DB�� ����");
	}
	
	@Override
	public void update() {
		System.out.println("mySql DB�� ����");
	}
	
	@Override
	public void delete() {
		System.out.println("mySql DB���� ����");
	}
}
