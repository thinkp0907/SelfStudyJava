package sec02.exam02;

public class PrintThread1 extends Thread{
	private boolean stops;
	
	
	public void setStop(boolean stops) {
		this.stops = stops;
	}
	
	@Override
	public void run() {
		while(!stops) {
			System.out.println("���� ��");
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
