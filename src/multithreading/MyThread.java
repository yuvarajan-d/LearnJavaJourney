package multithreading;

public class MyThread extends Thread{

	public void loop(int value) {
		for(int i=1;i<=value;i++) {
			try {
			System.out.println("Normal Method: "+i);
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			try {
			System.out.println("Thread Method: "+i);
			Thread.sleep(1000);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
	}
}
