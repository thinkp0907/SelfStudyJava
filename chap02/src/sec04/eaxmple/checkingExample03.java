package sec04.eaxmple;

import java.util.Scanner;

public class checkingExample03 {

	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.print("주민번호 앞 6자리: ");
		String Id = scanner.nextLine();
		
		System.out.print("전화번호: ");
		String phone = scanner.nextLine();
		
		System.out.println("이름: " + name);
		System.out.println("주민번호 앞 6자리: " + Id);
		System.out.printf("전화번호: %s",phone);
	}

}
