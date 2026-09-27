package abstraction_interface_accessmodifier_practice;

public abstract class Employee {
	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name=name;
		this.id=id;
	}
	
	public abstract void work();

}
