package sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField: " + fiv.byteField);				// 0
		System.out.println("shortField: " + fiv.shortField);			// 0
		System.out.println("intField: " + fiv.intField);				// 0
		System.out.println("longField: " + fiv.longField);				// 0
		System.out.println("booleanField: " + fiv.booleanField);		// false
		System.out.println("charField: " + fiv.charField);				// �����
		System.out.println("floatField: " + fiv.floatField);			// 0.0f
		System.out.println("doubleField: " + fiv.doubleField);			// 0.0
		System.out.println("arrField: " + fiv.arrField);				// null
		System.out.println("referenceField: " + fiv.referenceField);	// null
	}

}
