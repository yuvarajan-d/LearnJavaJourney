package oops_seminar;

public class Student {
	String name;
	int age;
	String department;
	
	Student(String name,int age,String department){
		this.name=name;
		this.age=age;
		this.department=department;
	}
	
	void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Department : "+department);
	}

}
