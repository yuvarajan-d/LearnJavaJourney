package multithreading;

public class AnotherThread implements Runnable{
	
	public void run() {
		try {
			System.out.println("Order Confirmed");
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Order Delivered");
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
