package study.practice.practice23;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        Student student = new Student();

	        // Setter 사용
	        student.setDepartment("컴공");
	        student.setStudentId(20231234);

	        // Getter 사용
	        System.out.println("학과: " + student.getDepartment() + "학번: " + student.getStudentId());
	    }
	    
	}
