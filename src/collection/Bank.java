package collection;

public class Bank {
	private String customername;
	private double balance;
	public Bank(String customername, double balance) {
		this.customername = customername;
		this.balance = balance;
	}
	public Bank() {
		
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
