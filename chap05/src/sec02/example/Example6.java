package sec02.example;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.���� ");
			System.out.println("-----------------------------------------------------");
			System.out.print("����> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("�л���> ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scores = new int[studentNum];
				continue;
			} else if (selectNo == 2) {
				for (int i=0; i<scores.length; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
					
				}
				continue;
				
			} else if (selectNo == 3) {
				for (int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				continue;
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
				
				for (int num: scores) {
					sum = sum + num;
				}
				avg = (double) sum / scores.length;
				
				for (int i=0; i<scores.length-1; i++) {
					if (scores[i] > scores[i+1]) {
						max = scores[i];
					} else {
						max = scores[i+1];
					}
				}
				
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);
			
			} else if (selectNo == 5) {
				run = !run;
				break;
			}
		}
		System.out.println("���α׷� ����");
	}

}
