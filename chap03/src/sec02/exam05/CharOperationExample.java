package sec02.exam05;

public class CharOperationExample {

	public static void main(String[] args) {
		char c1 = 'A' + 1;		// --> char c1 = 66; ���� �����ϵ�
		char c2 = 'A';
		// char c3 = c2+1;		// --> char ������ ��� ���꿡 ���Ǹ� int Ÿ������ ��ȯ�ǹǷ� ���� ����� int Ÿ���� ��
		// char c3 = (char) (c2 + 1) �� ���� Ÿ�� ��ȯ���� ����
		System.out.println("c1: " +c1);
		System.out.println("c2: " +c2);
		// System.out.println("c3" + c3);
	}

}
