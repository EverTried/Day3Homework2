
public class Student extends User {
	
	public Student(int id, String firstName, String lastName, String eMail, String userName, String password,
			String phoneNumber) {
		super(id, firstName, lastName, eMail, userName, password, phoneNumber);
		// TODO Auto-generated constructor stub
	}

	public Student() {
		
	}
	
	private double percentage;

	public double getPercentage() {
		return percentage;
	} 
	
	

}
