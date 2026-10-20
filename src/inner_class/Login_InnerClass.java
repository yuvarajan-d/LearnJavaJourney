package inner_class;

import java.util.Scanner;

public class Login_InnerClass {
	
	private String correctUsername = "admin";
    private String correctPassword = "1234";

    public void login() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        new Login(username, password);

        sc.close();
    }
    
	class Login {
        Login(String user, String pass) {
            if (correctUsername.equals(user) &&
                correctPassword.equals(pass)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Username or Password");
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Login_InnerClass inner = new Login_InnerClass();
		inner.login();
	}

}
