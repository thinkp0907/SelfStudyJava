package sec02.example;

public class Example3 {

	public static void main(String[] args) {
		int sum = 0;
		
		while(true) {
			int i = (int) (Math.random() * 6) + 1;
			int j = (int) (Math.random() * 6) + 1;
			
			if (i+j != 5) {
				System.out.println("1�� ��" + i);
				System.out.println("2�� ��" + j);
				continue;
			} else {
				System.out.println("1�� ��" + i);
				System.out.println("2�� ��" + j);
				sum = i+j;
				break;
			}
		}
		
		System.out.println("���� ��" + sum);
		
	}

}
