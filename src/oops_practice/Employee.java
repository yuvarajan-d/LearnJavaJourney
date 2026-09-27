package oops_practice;

public class Employee {
	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	void displayEmployeeDetails() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}

}
