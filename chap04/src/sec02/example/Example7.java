package sec02.example;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			
			
			switch(num) {
			case 1:
				System.out.print("���ݾ�>");
				balance += Integer.parseInt(scanner.nextLine());
				continue;
			case 2:
				System.out.print("��ݾ�>");
				balance -= Integer.parseInt(scanner.nextLine());
				continue;
			case 3:
				System.out.println("�ܰ�>" + balance);
				continue;
			case 4:
				run = !run;
				break;
			}
			System.out.println();
		}
		System.out.println("���α׷�����");
	}

}
