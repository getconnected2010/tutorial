package tutorial;


public class Student extends User{
	
	private String major;
	
	public Student(String fName, String lName, String major) {

		super(fName, lName);
		this.major = major;
	}
	
	public void superExtent() {
		super.greet();
	}

	public String greet() {
		return "hello I'm a student. major "+ major;
	}

}
