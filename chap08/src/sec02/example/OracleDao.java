package sec02.example;

public class OracleDao implements DataAccessObject{
	// �ʵ�
	
	// ������
	
	// �޼ҵ�
	@Override
	public void select() {
		System.out.println("OracleDB���� �˻�");
	}
	
	@Override
	public void insert() {
		System.out.println("OracleDB�� ����");
	}
	
	@Override
	public void update() {
		System.out.println("OracleDB�� ����");
	}
	
	@Override
	public void delete() {
		System.out.println("OracleDB���� ����");
	}
}
