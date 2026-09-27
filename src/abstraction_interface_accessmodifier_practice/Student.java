package abstraction_interface_accessmodifier_practice;

public class Student {

	public String name;
	int rollNo;
	protected String college;
	private String password;
	
	public Student(String name, int rollNo,String college,String password) {
		this.name=name;
		this.rollNo=rollNo;
		this.college=college;
		this.password=password;
	}
	
	public String getPassword() {
		return password;
	}
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("College: "+college);
	}
}
