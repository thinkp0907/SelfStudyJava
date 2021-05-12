package sec03.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("--------");
		
		// ������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();							// �ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣǮ
		animal.sound();		
		
		animal = new Cat();							// �ڵ� Ÿ�� ��ȯ �� �����ǵ� �޼ҵ� ȣǮ
		animal.sound();
		System.out.println("--------");
		
		// �޼ҵ��� ������
		animalSound(new Dog());						// �ڵ� Ÿ�� ��ȯ (Animal animal)
		animalSound(new Cat());						// �ڵ� Ÿ�� ��ȯ (Animal animal)
		
		
		
		}
	public static void animalSound(Animal animal) {
		animal.sound();
	}

}
