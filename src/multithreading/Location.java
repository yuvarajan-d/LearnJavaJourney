package multithreading;

public class Location extends Thread{
	
	public void run() {
		try {
			Thread.sleep(4000);
			System.out.println("Order on the way");
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
