package sec02.exam05;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread thread = new AutoSaveThread();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		System.out.println("���� ������ ����");
	}

}
