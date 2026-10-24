package multithreading;

public class Another_Synchronized {
	
	synchronized void method4() throws InterruptedException {
		for(int i=1;i<6;i++) {
		System.out.println("Fourth thread");
		Thread.sleep(1000);
		}
	}

}
