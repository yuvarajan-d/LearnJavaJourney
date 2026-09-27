package abstraction_interface_accessmodifier_practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1
		Payment payment;
		payment =new CreditCard();
		payment.pay(1500);
		payment=new UPI();
		payment.pay(800);
		
		System.out.println("");
		
		//2
		Vehicle car=new Car();
		Vehicle bike=new Bike();
		
		car.start();
		car.stop();
		System.out.println("");
		bike.start();
		bike.stop();
		
		System.out.println("");

		//3
		SavingAccount account=new SavingAccount(101, "Yuvarajan", 5000);
		account.showAccess();
		account.deposit(3000);
		account.withdraw(1000);
		account.displayDetails();
		
		System.out.println("");
		
		//4
		Manager manager=new Manager("Yuvaraj", 121, 60000);
		manager.work();
		manager.displayDetails();
		
		System.out.println("");
		
		//5
		CollgeStudent student=new CollgeStudent("Yuvaraj", 121, "SAIRAM College", "secure123");
		student.showAccess();
		System.out.println("");
		student.displayDetails();
	}

}
