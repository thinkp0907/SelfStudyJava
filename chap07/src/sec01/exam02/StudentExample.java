package sec01.exam02;

public class StudentExample {
	
	public static void main(String[] args) {
		Student student = new Student("ȫ�浿", "123456-1234567", 1);
		System.out.println("name: " + student.name);				// �θ𿡰� ��ӹ��� �ʵ�
		System.out.println("ssn: " + student.ssn);					// �θ𿡰� ��ӹ��� �ʵ�
		System.out.println("studentNo: " +student.studentNo);
	}
}
