package sec01.exam03;

public class ComputerExample {
	
	public static void main(String[] args) {
		int r = 10;
		
		Calculator myCal = new Calculator();
		System.out.println("원면적: " +myCal.areaCircle(r));
		System.out.println();
		
		Computer myCom = new Computer();
		System.out.println("원면적: " +myCom.areaCircle(r));		// Calculator 메소드를 Computer 메소드에서 재정의함
		System.out.println();
		
	}
}
