package loopsandcondition_practice;

public class Student {

	String name;
	
	static String collegeName="Sairam Engineering College";
	
	Student(String name){
		this.name=name;
	}
	
	void displayDetails() {
		System.out.println("Student Name: "+name);
		System.out.println("College: "+collegeName);
	}
}
