package sec01.exam03;

public class ComputerExample {
	
	public static void main(String[] args) {
		int r = 10;
		
		Calculator myCal = new Calculator();
		System.out.println("������: " +myCal.areaCircle(r));
		System.out.println();
		
		Computer myCom = new Computer();
		System.out.println("������: " +myCom.areaCircle(r));		// Calculator �޼ҵ带 Computer �޼ҵ忡�� ��������
		System.out.println();
		
	}
}
