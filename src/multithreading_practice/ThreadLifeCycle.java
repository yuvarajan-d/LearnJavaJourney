package multithreading_practice;

public class ThreadLifeCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OrderProcess order = new OrderProcess();
		
		System.out.println("State after thread creation: "+order.getState());
		order.start();
		System.out.println("State after start(): "+ order.getState());
		
		try {
			Thread.sleep(500);
			System.out.println("State during sleep(): "+ order.getState());
			order.join();
			
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}

	}

}
