package sec01.exam02;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour = 3; int minute = 5;		
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute; 	// 변수 hour에 저장된 값으로 대체, 변수 minute에 저장된 값으로 대체
		System.out.println("총 " + totalMinute + "분");
	}

}
