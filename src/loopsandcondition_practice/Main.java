package loopsandcondition_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		int[] marks= {75,45,60,35,80};
		for(int i=0;i<marks.length;i++) {
			System.out.println("Student "+(i+1)+" Mark: "+marks[i]);
			if(marks[i]>50) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
		}

		System.out.println("");
		
		//2
		String username="admin";
		String password="12345";
		if(username.equals("admin")  && password.equals("12345")) {
			System.out.println("Login sucessfully");
		}else {
			System.out.println("Invalid Login");
		}
		
		System.out.println("");
		
		//3
		double basic_salary=30000;
		final double PF_Percentage=12;
		
		double pfAmount=basic_salary*PF_Percentage/100;
		
		System.out.println("Basic Salary: "+basic_salary);
		System.out.println("PF Percentage: "+PF_Percentage+"%");
		System.out.println("PF Amount: "+pfAmount);
		
		System.out.println("");
		
		//4
		Student s1=new Student("Yuvaraj");
		Student s2=new Student("Hemanth");
		Student s3=new Student("Arun");
		
		s1.displayDetails();
		System.out.println("");
		s2.displayDetails();
		System.out.println("");
		s3.displayDetails();
		
		System.out.println("");
		
		//5
		double[] salaries= {45000,60000,35000,70000,50000};
		for(int i=0;i<salaries.length;i++) {
			Employee employee=new Employee(salaries[i]);
			System.out.println("Employee "+(i+1));
			employee.calculateSalary();
		}
		System.out.println("Total Employees: "+Employee.employeecount);
	}

}
