package sec04.exam04;

public class Calculator {
	int plus(int x, int y) {
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7,10);
		println("������: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}
}
