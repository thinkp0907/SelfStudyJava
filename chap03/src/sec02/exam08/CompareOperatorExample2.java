package sec02.exam08;

public class CompareOperatorExample2 {

	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); 	// true 	int Ÿ���� �ڵ����� double Ÿ������ ��ȯ��
		
		double v4 = 0.1;
		float v5 = 0.1f;
		System.out.println(v4 == v5);	// false	0.1f�� 0.1�� �ٻ簪(0.1000000149011612)�� ǥ���Ǹ� �̴� 0.1���� ū ��
		System.out.println((float) v4 == v5);	//true
	}

}
