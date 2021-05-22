package lesson3exercise;

public class Instructor extends User{
	
	public Instructor(int id, String name, String surname, String username, String email, String password,
			String profession) {
		super(id, name, surname, username, email, password);
		this.profession = profession;
	}

	private String profession;

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

}
