package sec01.exam04;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���Ͻô� �������� �Է��ϼ���!");
		int multiply = scanner.nextInt();
				
		while(multiply != 10) {
			
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", multiply, i, multiply * i);
			}
			
			System.out.print("�߰��� ������ ���Ͻô� �������� �����ø� �Է����ּ���! (2~9���� ����)\n");
			System.out.print("10�� �Է��Ͻø� ����˴ϴ�.\n");
			multiply = scanner.nextInt();
			
			
		}
		
	}

}
