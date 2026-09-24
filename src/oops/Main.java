package oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc=new Calculator(56,24);
		System.out.println("Addition: "+calc.add(20, 10));
		System.out.println("Subtraction: "+calc.sub(30, 10));
		System.out.println("Multiply: "+calc.mul(20,2));
		System.out.println("Division: "+calc.div(36, 4));
		System.out.println("Add two String :"+calc.AddtwoString("Hemanth","Raj"));
//		calc.message();
		
//		System.out.println("Inheritance");
//		Child child=new Child();
//		child.findindex("Hello world");
//		child.findtotallength("Yuvarajan");
//		
//		System.out.println("------------Polymorphism--------------");
//		Polymorphism p=new Polymorphism();
//		p.arithmetic();
//		p.arithmetic(2, 3);
//		p.arithmetic(2.3f,4.5f);
//		p.arithmetic(1, 2, 3);
		
		Childoverride co=new Childoverride();
		co.game();
		
		System.out.println("Encapsulation...");
		Bank_encapsulation bank=new Bank_encapsulation();
		bank.setAccno(1234);
		bank.setBalance(5000);
		bank.setPin(1234);
		System.out.println(bank.getAccono()+" "+bank.getBalance()+" "+bank.getPin());

	}

}
