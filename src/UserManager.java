
public class UserManager {
	
	public void signIn(User user) {
		
		System.out.println(user.firstName + " " + user.lastName + " olarak giri� yap�ld�...");
		
	}
	
	
		
	public void addUser(User user) {
			
			System.out.println(user.firstName + " " + user.lastName + " sisteme eklendi..");
			
		}
	public void deleteUser(User user) {
		
		System.out.println(user.firstName + " " + user.lastName  +" sistemden silindi");
		
	}
	
	public void updateUser(User user) {
		
		System.out.println(user.firstName + " " + user.lastName + " olarak g�ncellendi...");
	}
	
	
	public void signOut(User user) {
		
		System.out.println("G�venli ��k�� Yap�ld�...");
	}

}
