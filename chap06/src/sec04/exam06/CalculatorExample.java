package sec04.exam06;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		
		// 정사각형 넓이 구하기
		double result1 = myCal.areaRectangle(10);
		
		
		// 직사가형 넓이 구하기
		double result2 = myCal.areaRectangle(10, 20);
		
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
	}

}
