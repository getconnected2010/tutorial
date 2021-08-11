package tutorial;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] fName= {"eden", "mititi", "lily", "nati"};
		String[] lName = {"grace", "eyob", "eyob", "eyuye"};
		List<User> fullName = new ArrayList<User>();
		//for(int i =0; i< fName.length; i++) {
		//	fullName.add(i, new User(fName[i], lName[i]));
		//}
		User.listFullName(fullName);

		User y = new Student("daddy", "mommy", "sceince");
		System.out.print(y.greet());
	}
}