package sec04.eaxmple;

import java.util.Scanner;

public class checkingExample03 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		String name = scanner.nextLine();
		
		System.out.print("�ֹι�ȣ �� 6�ڸ�: ");
		String Id = scanner.nextLine();
		
		System.out.print("��ȭ��ȣ: ");
		String phone = scanner.nextLine();
		
		System.out.println("�̸�: " + name);
		System.out.println("�ֹι�ȣ �� 6�ڸ�: " + Id);
		System.out.printf("��ȭ��ȣ: %s",phone);
	}

}
