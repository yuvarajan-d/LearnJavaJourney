package operators_and_typecasting_practice;

public class Operator_and_typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1. Student Marks Calculation
//		A student has scored 85 marks out of 100. Store the marks as int, but calculate the percentage as a double.
//
//		Question:
//		Write a Java program using type casting and arithmetic operators to calculate and display the percentage.
		
		int mark=85;
		int totalmarks=100;
		double percentage=((double)mark/totalmarks)*100;
		System.out.println("Student Marks :- ");
		System.out.println("Mark : "+mark);
		System.out.println("Percentage : "+percentage+"%");
		System.out.println("");
		
//		2. Product Price Calculation
//		A product costs 999.50. The customer buys 3 products and receives a discount of 10%.
//
//		Question:
//		Write a Java program using type casting, arithmetic operators, and assignment operators to calculate the final price.

		double price=999.50;
		int quantity=3;
		double discount=10;
		double totalprice=price*quantity;
		double discountamount=totalprice*((double)discount/100);
		totalprice-=discountamount;
		System.out.println("Product price  :- ");
		System.out.println("price per product: "+price);
		System.out.println("quantity: "+quantity);
		System.out.println("discount: "+discount+"%");
		System.out.println("final price: "+totalprice);
		System.out.println("");
		
//		3. Employee Salary
//		An employee's monthly salary is 25000. The company gives a 15% increment.
//
//		Question:
//		Write a Java program using arithmetic and relational operators to calculate the new salary and check whether the new salary is greater than 28000.

		double salary=25000;
		double increment=15;
		double incrementamount=salary*increment/100;
		double newSalary=salary+incrementamount;
		
		boolean salaryCheck=newSalary>28000;
		
		System.out.println("Employee Salary:- ");
		System.out.println("original salary: "+salary);
		System.out.println("Increment: "+increment+"%");
		System.out.println("New Salary: "+newSalary);
		System.out.println("Is salary greater than 28000? "+ salaryCheck);
		System.out.println("");
		
//		4. Number Conversion
//		A user enters the value 25 as a double.
//
//		double value = 25.75;
//		Question:
//		Convert the double value into an int using explicit type casting and use the % operator to check whether the converted number is even or odd.
		
		double value=25.75;
		int number=(int) value;
		System.out.println("Number Conversion");
		System.out.println("original value: "+value);
		System.out.println("Converted value: "+number);
		if(number%2==0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		System.out.println("");
//		5. Driving Eligibility
//		A person's age is stored as a double.
//
//		double age = 21.5;
//		Question:
//		Convert the age into an int using type casting and use relational and logical operators to check whether the person is eligible to apply for a driving license (age >= 18 and age <= 60).
		
		double age=21.5;
		int convertedAge=(int)age;
		boolean eligible=convertedAge>=18 && convertedAge<=60;
		System.out.println("Driving Eligibility: ");
		System.out.println("original Age: "+age);
		System.out.println("Converted Age: "+convertedAge);
		System.out.println("Eligible for driving license: "+ eligible);
		
		
	}

}
