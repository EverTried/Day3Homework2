
public class InstructorManager extends UserManager{
	
	public void openCourse(Course course) {
		System.out.println(course.getName() + " kursu açıldı.");
	}
	
	public void closeCourse(Course course) {
		System.out.println(course.getName() + " kursu kapatıldı..");
	}

}
