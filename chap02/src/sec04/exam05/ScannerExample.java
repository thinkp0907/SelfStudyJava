package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String input;
		
		while(true) {
			input = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + input + "\"");
			if(input.equals("q")) {
				break;
			}
		}
		
		System.out.print("����");
		
	}

}
