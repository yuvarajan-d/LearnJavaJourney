package multithreading_practice;

public class OrderProcess extends Thread {
	
	public void run() {
		try {
			System.out.println("Order is being processed...");
			System.out.println("Thread state inside run(): "+Thread.currentThread().getState());
			System.out.println("Order verification is progress...");
			Thread.sleep(2000);
			System.out.println("Order processing resumed after 2 seconds.");
			System.out.println("Order completed successfully.");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
