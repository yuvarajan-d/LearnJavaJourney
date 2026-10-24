package multithreading;

public class Sub_SynchronizedThread extends Another_Synchronized{
	
	synchronized void method1() throws InterruptedException {
		System.out.println("First thread");
		Thread.sleep(1000);
		wait();
		System.out.println("First thread completed");
	}
	
	synchronized void method2() throws InterruptedException {
		for(int i=1;i<=10;i++) {
		System.out.println("Second thread");
		Thread.sleep(1000);
		wait();
		System.out.println("Second thread completed");
		}
	}
	
	synchronized void method3() throws InterruptedException {
		System.out.println("Third thread");
		Thread.sleep(1000);
		wait();
		System.out.println("Third thread completed");
	}
	
	void normal() {
		System.out.println("Normal  Thread");
	}
	
	synchronized void awake() {
		notifyAll();
		System.out.println("First thread is unlocked");
	}
	
	

	public static void main(String args[]) throws InterruptedException {
		Sub_SynchronizedThread subsync = new Sub_SynchronizedThread();
		Thread s1 = new Thread(()->{
			try {
				subsync.method1();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread s2 = new Thread(()->{
			try {
				subsync.method2();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread s3 = new Thread(()->{
			try {
				subsync.method3();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread s4 = new Thread(()->{
			try {
				subsync.method4();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread unlock = new Thread(()->{
			subsync.awake();
		});
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		unlock.start();
		s3.join();
		subsync.normal();
	}
}
