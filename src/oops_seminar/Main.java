package oops_seminar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1=new Student("Yuvaraj",21,"CSBS");
		Student student2=new Student("Arun",22,"IT");
		
		System.out.println("Class and Objects");
		System.out.println("");
		
		student1.displayDetails();
		
		System.out.println("");
		
		student2.displayDetails();
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Inheritance");
		System.out.println("");
		
		Developer developer = new Developer();
		developer.name="Yuvaraj";
		developer.salary=45000;
		developer.ProgrammingLanguage="Java";
		developer.displayDevoperDetails();
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Encapsulation");
		
		BankAccount account = new BankAccount();
		account.setUserId(101);
		account.setBalance(5000);
		System.out.println("User ID :" + account.getUserId());
		System.out.println("Balance : "+ account.getBalance());
		account.deposit(2000);
		account.withdraw(1500);
		System.out.println("Final balance : "+ account.getBalance());
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Polymorphism OverRiding");
		Payment payment;
		payment=new UPIPayment();
		payment.pay();
		payment=new CardPayment();
		payment.pay();
		payment=new CashPayment();
		payment.pay();
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Polymorphism OverLoading");
		Calculator calculator=new Calculator();
		System.out.println(calculator.add(10, 20));
		System.out.println(calculator.add(10, 20, 30));
		System.out.println(calculator.add(10.5, 20.50));
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Abstraction");
		
		Vehicle car=new Car();
		car.start();
		car.stop();
		System.out.println("");
		Vehicle bike=new Bike();
		bike.start();
		bike.stop();
		
		System.out.println("-----------------------------------------------------------------------");
		
		System.out.println("Abstraction");
		
		RemoteControl remote;
		remote = new Television();
		remote.turnOn();
		remote.turnOff();
		
		remote=new AirConditioner();
		remote.turnOn();
		remote.turnOff();
		
	}

}
