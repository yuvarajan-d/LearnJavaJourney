package abstraction_interface_accessmodifier_practice;

public class Manager extends Employee implements Bonus {
	
	double salary;
	
	public Manager(String name, int id, double salary) {
		super(name,id);
		this.salary=salary;
	}
	
	public void work() {
		System.out.println("Manager "+name+" is managing the team");
	}
	public double calculateBonus(double salary) {
		return salary*0.10;
	}
	public void displayDetails() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Bonus: "+calculateBonus(salary));
	}

}
