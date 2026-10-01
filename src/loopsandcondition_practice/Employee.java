package loopsandcondition_practice;

public class Employee {

	static int employeecount=0;
	final static double TAX_RATE=10.0;
	double salary;
	
	Employee(double salary){
		this.salary=salary;
		employeecount++;
	}
	
	void calculateSalary() {
		
		double tax=salary*TAX_RATE/100;
		double netSalary=salary-tax;
		System.out.println("Salary: "+salary);
		System.out.println("Tax: "+tax);
		System.out.println("Net Salary: "+netSalary);
		
		if(salary>50000) {
			System.out.println("High salary");
		}else {
			System.out.println("Normal Salary");
		}
		
		System.out.println("");
	}
}
