package multithreading_practice;

public class Customer1 extends Thread {
	
	FoodOrder order;
	
	public Customer1(FoodOrder order) {
		// TODO Auto-generated constructor stub
		this.order=order;
	}
	
	public void run() {
		order.collectFood();
	}

}
