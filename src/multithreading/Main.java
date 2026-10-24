package multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread mythread = new MyThread();
		mythread.start();
		
		AnotherThread anotherthread = new AnotherThread();
		System.out.println("Current 1: "+ mythread.isAlive());
		if(mythread.isAlive()) {
			System.out.println("Thread is Running");
		}
		Thread thread = new Thread(anotherthread);
		
		thread.start();
		mythread.join();
		System.out.println("Current 1: "+ mythread.isAlive());
		System.out.println("Thank you....");
		mythread.loop(10);
		
		
		// Task
//		Order order = new Order();
//		Shop shop = new Shop();
//		Location location =  new Location();
//		order.start();
//		shop.start();
//		location.start();
//		
		
	}

}
