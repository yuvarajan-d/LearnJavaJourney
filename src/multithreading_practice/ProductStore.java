package multithreading_practice;

public class ProductStore {
	
	private int products=0;
	
	public synchronized void produce(int quantity) {
		products+=quantity;
		System.out.println("Producer produced "+quantity+" products");
		System.out.println("Available products: "+products);
		
		if(quantity==1) {
			System.out.println("Producer calls notify()");
			notify();
		}else {
			System.out.println("Producer calls notifyAll()");
			notifyAll();
		}
	}
	
	public synchronized void consume() {
		while(products==0) {
			System.out.println(Thread.currentThread().getName()+" is waiting for the product..");
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
			
			products--;
			System.out.println(Thread.currentThread().getName()+" consumed a product.");
			System.out.println("Remaining products: "+products);
		}
	}

}
