package sec02.example;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		anony.field.start();
		anony.method1();
		anony.method2(new Worker() {
			@Override
			public void start() {
				System.out.println("�׽�Ʈ�� �մϴ�.");
			}
		});
	}

}
