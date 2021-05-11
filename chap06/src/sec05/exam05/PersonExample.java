package sec05.exam05;

public class PersonExample {

	public static void main(String[] args) {
		Person p1 = new Person("123456-12345678", "È«±æµ¿");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
//		p1.nation = "usa";				// Unresolved compilation problems:
//		p1.ssn = "654321-7654321";		// The final field cannot be assigned
		p1.name = "È«»ï¿ø";
		
		System.out.println(p1.name);
	}

}
