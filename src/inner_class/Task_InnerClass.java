package inner_class;

import java.util.Scanner;

public class Task_InnerClass {
	
	private String correctUsername = "admin";
    private String correctPassword = "1234";
	
    class Login{
    	void checkCredentials(String username, String password) {
            if (correctUsername.equals(username) && correctPassword.equals(password)) {
                System.out.println("Login Successful!");
            } else {
                System.out.println("Invalid Username or Password!");
            }
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();
        
		Task_InnerClass outer = new Task_InnerClass();
		Task_InnerClass.Login inner = outer.new Login();
		inner.checkCredentials(username, password);
		sc.close();
		
		

	}

}
