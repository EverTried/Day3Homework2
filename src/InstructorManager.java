
public class InstructorManager extends UserManager{
	
	public void openCourse(Course course) {
		System.out.println(course.getName() + " kursu a��ld�.");
	}
	
	public void closeCourse(Course course) {
		System.out.println(course.getName() + " kursu kapat�ld�..");
	}

}
