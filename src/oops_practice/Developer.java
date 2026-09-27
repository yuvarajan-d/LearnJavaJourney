package oops_practice;

public class Developer extends Employee {
	String programminglanguage;
	
	Developer(String name,int id,double salary,String programminglanguage){
		super(name,id,salary);
		this.programminglanguage=programminglanguage;
	}
	void displayDeveloperDetails() {
		displayEmployeeDetails();
		System.out.println("Programming Language: "+programminglanguage);
		System.out.println("");
	}

}
