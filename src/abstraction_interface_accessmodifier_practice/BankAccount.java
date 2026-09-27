package abstraction_interface_accessmodifier_practice;

public class BankAccount {

	int accontno;
	protected String accountHolderName;
	private double balance;
	
	BankAccount(int accountno, String accountHolderName, double balance){
		this.accontno=accountno;
		this.accountHolderName=accountHolderName;
		this.balance=balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposited: "+amount);
		}
	}
	public void withdraw(double amount) {
		if(balance>0) {
			balance-=amount;
			System.out.println("withdrawn amount: "+amount);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	public void displayDetails() {
		System.out.println("Account Number: "+accontno);
		System.out.println("Account Holder: "+accountHolderName);
		System.out.println("Balance: "+balance);
	}
}
