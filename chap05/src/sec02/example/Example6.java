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
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.print("학생수> ");
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
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
			
			} else if (selectNo == 5) {
				run = !run;
				break;
			}
		}
		System.out.println("프로그램 종료");
	}

}
