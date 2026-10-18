package exception;

public class Bank {

	public void bank(int balance) {
		try {
		if(balance<500) {
			throw new Min500exception("Minimum balance maintain");
		}else {
			System.out.println("Balance above 500");
		}
		}
		catch(Min500exception e) {
			System.out.println(e);
		}
	}
}
