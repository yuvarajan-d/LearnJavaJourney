package oops;

public class Bank_encapsulation {
	
	private long accno;
	private double balance;
	private int pin;
	private int count[]= {89,12};
	//set method to collect particular one data
	// constructor to give data
	//get
	
	public Bank_encapsulation(long accno, double balance, int pin) {
		this.accno=accno;
		this.balance=balance;
		this.pin=pin;
	}
	public Bank_encapsulation() {
		
	}
	
	public void setAccno(long accno) {
		this.accno=accno;
	}
	public long getAccono() {
		return accno;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getBalance() {
		return balance;
	}
	public void setPin(int pin) {
		this.pin=pin;
	}
	public int getPin() {
		return pin;
	}
	public int[] getCount() {
		return count;
	}

}
