package sec05.exam04;

public class Singleton {
	// �ʵ�
	// ���� �ʵ�
	private static Singleton singleton = new Singleton();
	// private static Ŭ���� singleton = new Ŭ����()
	
	// ������
	private Singleton() {};
	// private Ŭ����() {};
	
	// �޼ҵ�
	// ���� �޼ҵ�
	static Singleton getInstance() {
		return singleton;
		
	/* static Ŭ���� �޼ҵ�() {
	 *	 return singleton;
	 * }
	 */
	}
}
