package sec01.exam07;

public class Calculator {
	// �ʵ�
	private int memory;
	
	// ������
	
	// �޼ҵ�
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
