package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car();
		
		
		// �ʵ尪 �б�
		
		System.out.println("����ȸ��: " + myCar.company);			// �����ڵ���
		System.out.println("�𵨸�: " + myCar.model);				// �׷���
		System.out.println("����: " + myCar.color);				// ����
		System.out.println("�ְ�ӵ�: " + myCar.maxSpeed);			// 350
		System.out.println("����ӵ�: " + myCar.speed);			// 0
		
		// �ʵ尪 ����
		myCar.speed = 60;
		System.out.println("������ ���� �ӵ�: " +myCar.speed);		// 60
		
	}

}
