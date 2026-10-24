package multithreading;

import java.util.Scanner;

public class Wait_notify_notifyAll {
	
	synchronized void order() {
		for(int i=1;i<=5;i++) {
			try {
			System.out.println("Order Booking: "+i);
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(i==1) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	synchronized void amount() {
		int amount=500;
		try {
		for(int i=1;i<=10;i++) {
			System.out.println("Amount "+amount);
			amount+=500;
			Thread.sleep(1000);
		}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	synchronized void location() {
		try {
			wait();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your location: ");
			String location =  sc.nextLine();
			System.out.println("Location: "+location);
			sc.close();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	synchronized void restartorder() {
		notify();
		System.out.println("...................");
	}

	
	synchronized void restartall() {
		notifyAll();
		System.out.println("********************************");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Wait_notify_notifyAll call = new Wait_notify_notifyAll();
		
		Thread t1= new Thread(()->{
			call.order();
		});
		
		Thread t2=new Thread(()->{
			call.amount();
		});
		
		Thread t3 = new Thread(()->{
			call.location();
		});
		
		Thread unlock = new Thread(()->{
			call.restartorder();
		});
		
		Thread unlockall = new Thread(()->{
			call.restartall();
		});
		
		
		
		t1.start();
		t2.start();
		t3.start();
		unlock.start();
		Thread.sleep(2000);
		unlockall.start();

	}

}
