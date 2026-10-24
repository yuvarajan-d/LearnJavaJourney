package multithreading;

public class ArrowThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread my = new Thread(()->{
			System.out.println("First");
		});
		
		
		Runnable inter = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Second");
			}
		};
		
		Thread my1 = new Thread(inter);
		
		
		my.setPriority(Thread.MIN_PRIORITY);
		my1.setPriority(Thread.MAX_PRIORITY);
		my.start();
		my1.start();

	}

}
