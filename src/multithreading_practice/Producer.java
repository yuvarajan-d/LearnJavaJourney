package multithreading_practice;

public class Producer extends Thread{

	ProductStore store;
	
	public Producer(ProductStore store) {
		// TODO Auto-generated constructor stub
		this.store=store;
	}
	
	public void run() {
		try {
			Thread.sleep(2000);
			store.produce(1);
			Thread.sleep(3000);
			store.produce(3);
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
