package multithreading;

public class Shop extends Thread{
	
	public void run() {
		try {
			Thread.sleep(2000);
			System.out.println("Order Accepted in shop");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(1000);
			System.out.println("Order Shipped from shop");
			
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
