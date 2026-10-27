package multithreading_practice;

public class ResultBoard {

	private boolean resultPublished = false;
	public synchronized void checkResult() {
		System.out.println(Thread.currentThread().getName()+" is waiting for the result..");
		while(!resultPublished) {
			try {
				wait();
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println(Thread.currentThread().getName()+" recieved the result and passed!");
	}
	public synchronized  void publishResult() {
		System.out.println("Teacher is publishing the result..");
		resultPublished=true;
		System.out.println("Result Published.");
		notifyAll();
	}
}
