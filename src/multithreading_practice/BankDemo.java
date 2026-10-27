package multithreading_practice;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount();
		
		Customer c1 = new Customer(account, "Thread-1");
		Customer c2 = new Customer(account, "Thread-2");
		c1.start();
		c2.start();
		try {
			c1.join();
			c2.join();
			
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\nFinal Balance: Rs"+account.getBalace());

	}

}
