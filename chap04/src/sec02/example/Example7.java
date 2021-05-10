package sec02.example;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			
			int num = Integer.parseInt(scanner.nextLine());
			
			
			switch(num) {
			case 1:
				System.out.print("예금액>");
				balance += Integer.parseInt(scanner.nextLine());
				continue;
			case 2:
				System.out.print("출금액>");
				balance -= Integer.parseInt(scanner.nextLine());
				continue;
			case 3:
				System.out.println("잔고>" + balance);
				continue;
			case 4:
				run = !run;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램종료");
	}

}
