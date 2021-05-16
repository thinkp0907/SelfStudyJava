package sec02.exam02;

public class PrintThread1 extends Thread{
	private boolean stops;
	
	
	public void setStop(boolean stops) {
		this.stops = stops;
	}
	
	@Override
	public void run() {
		while(!stops) {
			System.out.println("실행 중");
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
