package sec02.example9;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù ��° ��: ");
		String first = scanner.next();
		System.out.print("�� ��° ��: ");
		String second = scanner.next();
		
		double result = Double.parseDouble(first) / Double.parseDouble(second);
		
		System.out.println("--------------------");
		
		if (result != 0.0) {
			System.out.println("���: " + result);
		} else {
			System.out.println("���: ���Ѵ�");
		}
		
	}

}
