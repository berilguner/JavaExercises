package lesson3exercise;

public class UserManager {
	public void save(User user) {
		System.out.println(user.getUsername() + " kaydedildi.");
	}
	
	public void saveMultiple(User[] users) {
		for(User user : users) {
			save(user);
		}
	}

}
