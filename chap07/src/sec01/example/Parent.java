package sec01.example;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() Call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
