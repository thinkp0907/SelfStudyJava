package sec01.exam04;

import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하시는 구구단을 입력하세요!");
		int multiply = scanner.nextInt();
				
		while(multiply != 10) {
			
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", multiply, i, multiply * i);
			}
			
			System.out.print("추가로 진행을 원하시는 구구단이 있으시면 입력해주세요! (2~9사이 숫자)\n");
			System.out.print("10을 입력하시면 종료됩니다.\n");
			multiply = scanner.nextInt();
			
			
		}
		
	}

}
