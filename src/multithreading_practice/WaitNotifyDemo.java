package multithreading_practice;

public class WaitNotifyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodOrder order = new FoodOrder();
		
		Customer1 customer = new Customer1(order);
		Chef chef = new Chef(order);
		
		customer.start();
		chef.start();

	}

}
