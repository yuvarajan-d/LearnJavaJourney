package abstraction_interface_accessmodifier_practice;

public class SavingAccount extends BankAccount{
	public SavingAccount(int accountno, String accountHolderName, double balance) {
		super(accountno,accountHolderName,balance);
	}
	public void showAccess() {
		System.out.println("Account Number: "+accontno);
		System.out.println("Account Holder: "+accountHolderName);
		System.out.println("Balance: "+getBalance());
	}

}
