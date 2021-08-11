package tutorial;

import java.util.List;

public abstract class User {
	private String firstName;
	private String lastName;
	
	public User(String fName, String lName) {
		setFirstName(fName);
		setLastName(lName);
	}
	
	public void setFirstName(String fname) {
		firstName = fname;
	}
	public void setLastName(String lname) {
		lastName = lname;
	}
	public String getFullName () {
		return firstName + " " + lastName;
	}
	public String greet() {
		return "hello " + getFullName();
	}
	public String greet(boolean nice) {
		if(nice) {
			return "Nice to meet you " + getFullName();
		}
		return "You are not so nice "+ getFullName();
	}
	
	public static void listFullName(List<User> userList) {
		for(User u: userList) {
			System.out.println(u.getFullName());
		}
	}
}
