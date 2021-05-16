
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		Student student = new Student();
		student.setFirstName("Hasan");
		student.setLastName("�olak");
		userManager.addUser(student);
		
		
		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		userManager.addUser(instructor);
		
		Course course1 = new Course(1, "JAVA Temelleri 1");
		Course course2 = new Course(2, "JAVA Temelleri 2");
		Course course3 = new Course(3, "JAVA ile nesne y�nelimli programlamaya giri�");
		Course course4 = new Course(4, "JAVA ile nesne y�nelimli programlamada uzmanla�ma 1");
		Course[] courses = {course1, course2, course3, course4};
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(courses);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.openCourse(course4);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student, course2);
		
		
		

	}

}
