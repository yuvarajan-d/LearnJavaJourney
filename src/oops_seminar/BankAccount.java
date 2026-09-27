package oops_seminar;

public class BankAccount {
	
	private int userId;
	private double balance;
	
	public void setUserId(int userId) {
		this.userId=userId;
	}
	public int getUserId() {
		return userId;
	}
	
	public void setBalance(double balance) {
		if(balance<0) {
			System.out.println("balance cannot be negative");
		}else {
			this.balance=balance;
		}
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("deposited: "+amount);
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawn:"+amount);
		}else {
			System.out.println("Insufficent balance");
		}
	}

}
