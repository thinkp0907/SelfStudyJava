package sec01.example;

public class Student {
	// 필드
	private String studentNum;
	
	// 생성자
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	// 메소드
	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if(studentNum.equals(student.getStudentNum())) {
				return true;
			}
		}
		return false;
		
	}
}
