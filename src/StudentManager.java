
public class StudentManager extends UserManager {
	
	public void joinCourse(Student student, Course course) {
		
		System.out.println(student.getFirstName() + " " + course.getName() + " kursuna katıldınız.");
	}
	
	public void leaveCourse(Student student, Course course) {
		
		System.out.println(student.getFirstName() + " " + course.getName() + " kursundan ayrıldınız..");
	}
	
	
	
	

}
