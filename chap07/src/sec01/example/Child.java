package sec01.example;

public class Child extends Parent{
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		System.out.println("Child(String name) call");
	}
}
