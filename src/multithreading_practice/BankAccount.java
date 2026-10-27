package multithreading_practice;

public class BankAccount {
	
	private int balance=5000;
	
	public synchronized void withdraw(int amount) {
		System.out.println(Thread.currentThread().getName()+" wants to withdraw Rs"+amount);
		
		if(balance>=amount) {
			System.out.println("Withdrawal successul for "+Thread.currentThread().getName());
			balance-=amount;
			System.out.println("Remaining Balance: Rs"+balance);
		}else {
			System.out.println("Insufficient Balance for "+Thread.currentThread().getName());
		}
	}
	
	public int getBalace() {
		return balance;
	}

}
