package lesson3exercise;

public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "beril", "guner", "berilguner", "berilguner@gmail.com", "123456");
		Instructor instructor = new Instructor(1, "engin", "demirog", "engindemirog", "engindemirog@gmail.com", "1234", "Yazilim Gelistirici");
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		UserManager userManager = new UserManager();
		
		User[] users = {student, instructor};
		userManager.saveMultiple(users);
		
		studentManager.addStudent(student);
		instructorManager.addInstructor(instructor);
		

	}

}
