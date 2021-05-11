package sec05.exam04;

public class Singleton {
	// 필드
	// 정적 필드
	private static Singleton singleton = new Singleton();
	// private static 클래스 singleton = new 클래스()
	
	// 생성자
	private Singleton() {};
	// private 클래스() {};
	
	// 메소드
	// 정적 메소드
	static Singleton getInstance() {
		return singleton;
		
	/* static 클래스 메소드() {
	 *	 return singleton;
	 * }
	 */
	}
}
