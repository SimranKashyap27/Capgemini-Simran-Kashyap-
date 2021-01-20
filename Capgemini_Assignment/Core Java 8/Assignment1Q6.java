import java.util.Scanner;

class Login {
	String userId = "Ajay", password = "password";

	public String loginUser(String user, String pass) {
		if (user.equals(userId) && pass.equals(password)) {
			return "Welcome " + user;
		}
		else {
		return "dummy";
		}
	}
}

public class Assignment1Q6 {
	public static void main(String[] args) {
		int i = 0;
		Login myLogin = new Login();
		Scanner sc = new Scanner(System.in);
		for (i = 0; i < 3; i++) {
			System.out.println("Enter userId");
			String user = sc.nextLine();
			System.out.println("Enter password");
			String pass = sc.nextLine();
			String getReturn = myLogin.loginUser(user, pass);
			String getString = "Welcome " + myLogin.userId;
			if (getReturn.equals(getString)) {
				System.out.println(getReturn);
				break;
			}
			if(i<2) {
			System.out.println("You have entered wrong credentials ,please enter the right credentials.");
		}}
		if(i==3) {
			System.out.println("You have entered wrong credentials 3 times");
			System.out.println("Contact Admin");
		}
		sc.close();
	}
}