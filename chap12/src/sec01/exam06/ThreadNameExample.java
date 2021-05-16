package sec01.exam06;

public class ThreadNameExample {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();		//  현재 이 코드를 실행하는 메인 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName());
		
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
		
	}

}
