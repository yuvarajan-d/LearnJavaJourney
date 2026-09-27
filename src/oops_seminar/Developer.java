package oops_seminar;

public class Developer extends Employee {
	
	String ProgrammingLanguage;
	
	void displayDevoperDetails() {
		displayEmployeeDetails();
		System.out.println("Programming Language : "+ProgrammingLanguage);
	}

}
