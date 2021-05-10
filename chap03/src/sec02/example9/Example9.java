package sec02.example9;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		String first = scanner.next();
		System.out.print("두 번째 수: ");
		String second = scanner.next();
		
		double result = Double.parseDouble(first) / Double.parseDouble(second);
		
		System.out.println("--------------------");
		
		if (result != 0.0) {
			System.out.println("결과: " + result);
		} else {
			System.out.println("결과: 무한대");
		}
		
	}

}
