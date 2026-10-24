package multithreading;

public class Order extends Thread {

	public void run() {
		try {
			System.out.println("Order confirmed");
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}try {
			Thread.sleep(5000);
			System.out.println("Order Delivered");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
