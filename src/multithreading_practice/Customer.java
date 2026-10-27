package multithreading_practice;

public class Customer extends Thread {
	
	BankAccount account;
	
	public Customer(BankAccount account, String name) {
		// TODO Auto-generated constructor stub
		this.account=account;
		setName(name);
	}
	public void run() {
		account.withdraw(4000);
	}

}
