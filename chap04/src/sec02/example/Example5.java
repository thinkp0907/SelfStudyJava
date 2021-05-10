package sec02.example;

public class Example5 {

	public static void main(String[] args) {
		char a = '*';
		for(int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j == i ) {
					System.out.println();
			}
			
			}
		}
	}

}
