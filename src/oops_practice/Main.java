package oops_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1
		Students student1=new Students("Yuvaraj",121,92);
		Students student2=new Students("Hemanth",31,85);
		student1.displatStudentDetails();
		student2.displatStudentDetails();
		
		System.out.println("");
		
		// 2
		Developer developer1=new Developer("Arun",043,75000.75,".net");
		Developer developer2=new Developer("Yuvarajan",121,40000,"java");
		developer1.displayDeveloperDetails();
		developer2.displayDeveloperDetails();
		
		System.out.println("");
		
		//3
		BankAccount account=new BankAccount();
		account.setAccountNumber(3248);
		account.setBalance(50000);
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Balance: "+account.getBalance());
		account.deposit(30000);
		account.withdraw(40000);
		System.out.println("Final Balance: "+account.getBalance());
		
		System.out.println("");
		
		//4
		Payment payment;
		payment=new UPIPayment();
		payment.pay(1000);
		payment=new CardPayment();
		payment.pay(2000);
		payment=new CashPayment();
		payment.pay(500);
		
		System.out.println();
		
		//5
		Vehicle vehicle;
		
		vehicle=new Car();
		vehicle.setSpeed(80);
		vehicle.start();
		System.out.println("Car Seed: "+vehicle.getSpeed());
		vehicle.stop();
		
		System.out.println("");
		
		vehicle=new Bike();
		vehicle.setSpeed(60);
		vehicle.start();
		System.out.println("Bike Speed: "+vehicle.getSpeed());
		vehicle.stop();
		
		
		

	}

}
