
public class UserManager {
	
	public void signIn(User user) {
		
		System.out.println(user.firstName + " " + user.lastName + " olarak giriþ yapýldý...");
		
	}
	
	
		
	public void addUser(User user) {
			
			System.out.println(user.firstName + " " + user.lastName + " sisteme eklendi..");
			
		}
	public void deleteUser(User user) {
		
		System.out.println(user.firstName + " " + user.lastName  +" sistemden silindi");
		
	}
	
	public void updateUser(User user) {
		
		System.out.println(user.firstName + " " + user.lastName + " olarak güncellendi...");
	}
	
	
	public void signOut(User user) {
		
		System.out.println("Güvenli Çýkýþ Yapýldý...");
	}

}
