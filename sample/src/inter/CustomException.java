package inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		System.out.println("From EmployeeNotFoundException constr...");
	}

	public String toString() {
		return "EmployeeNotFoundException ....";
	}
}

public class CustomException {

	public static void main(String[] args) throws IOException {
		try {

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Un");
			String un = br.readLine();
			System.out.println("Enter Password");
			String pwd = br.readLine();

			if (un.equals("Deeps") && pwd.equals("pass")) {
				System.out.println("Welcome " + un);
			} else {
				throw new EmployeeNotFoundException();
			}
		} catch (EmployeeNotFoundException e) {
			e.printStackTrace();
		}

	}
}
