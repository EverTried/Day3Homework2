
public class StudentManager extends UserManager {
	
	public void joinCourse(Student student, Course course) {
		
		System.out.println(student.getFirstName() + " " + course.getName() + " kursuna kat�ld�n�z.");
	}
	
	public void leaveCourse(Student student, Course course) {
		
		System.out.println(student.getFirstName() + " " + course.getName() + " kursundan ayr�ld�n�z..");
	}
	
	
	
	

}
