package abstraction_interface_accessmodifier_practice;

public class CreditCard extends Payment {
	public void pay(double amount) {
		System.out.println("Paid "+amount+" using credit card.");
	}

}
