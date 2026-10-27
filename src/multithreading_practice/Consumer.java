package multithreading_practice;

public class Consumer extends Thread {

	ProductStore store;
	
	public Consumer(ProductStore store, String name) {
		// TODO Auto-generated constructor stub
		this.store=store;
		setName(name);
	}
	
	public void run() {
		store.consume();
	}
}
