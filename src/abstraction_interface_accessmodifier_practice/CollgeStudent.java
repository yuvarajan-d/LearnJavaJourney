package abstraction_interface_accessmodifier_practice;

public class CollgeStudent extends Student {

	public CollgeStudent(String name,int rollNo,String college,String password) {
		super(name,rollNo,college,password);
	}
	public void showAccess() {
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("College: "+college);
		System.out.println("Password: "+getPassword());
	}
}
