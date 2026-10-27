package multithreading_practice;

public class Chef extends Thread{

	FoodOrder order;
	
	public Chef(FoodOrder order) {
		// TODO Auto-generated constructor stub
		this.order=order;
	}
	
	public void run() {
		order.preparefood();
	}
}
