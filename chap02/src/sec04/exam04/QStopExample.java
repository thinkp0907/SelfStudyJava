package sec04.exam04;

public class QStopExample {

	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {				// keyCode에 113값인 "q"가 들어오면 반복문을 멈춘다.
				break;
			}
		}
		
		System.out.println("종료");
	}

}
