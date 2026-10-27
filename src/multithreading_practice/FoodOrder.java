package multithreading_practice;

public class FoodOrder {

	private boolean foodReady=false;
	public synchronized void collectFood() {
		System.out.println("Customer: Waiting for the food..");
		while(!foodReady) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Customer: Food recieved. Thank You!");
	}
	
	public synchronized void preparefood() {
		System.out.println("Chef: Preparing food..");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
		foodReady=true;
		System.out.println("Chef: Food is reacdy.");
		notify();
	}
}
