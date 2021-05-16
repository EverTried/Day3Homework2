
public class Instructor extends User {

	public Instructor(int id, String firstName, String lastName, String eMail, String userName, String password,
			String phoneNumber) {
		super(id, firstName, lastName, eMail, userName, password, phoneNumber);
		
	}
	
	public Instructor() {
		
	}
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
