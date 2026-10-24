package multithreading;

import java.util.Scanner;

public class MovieTicketBooking {

	synchronized void name() {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.print("Enter Customer Name " + i + ": ");
			String name = sc.nextLine();

			System.out.println("Customer Name: " + name);

			if (i == 1) {
				try {
					System.out.println("Waiting...");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	synchronized void payment() {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.print("Enter Payment Amount for Customer " + i + ": ");
			int amount = sc.nextInt();

			System.out.println("Payment Successful: Rs." + amount);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	synchronized void theatre() {

		Scanner sc = new Scanner(System.in);

		try {

			wait();

			for (int i = 1; i <= 3; i++) {

				System.out.print("Enter Theatre Name for Customer " + i + ": ");
				String theatre = sc.nextLine();

				System.out.println("Theatre: " + theatre);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	synchronized void restartOrder() {
		notify();
		System.out.println("notify() executed");
	}

	synchronized void restartAll() {
		notifyAll();
		System.out.println("notifyAll() executed");
	}

	public static void main(String[] args) throws Exception {

		MovieTicketBooking obj = new MovieTicketBooking();

		Thread t1 = new Thread(() -> obj.name());
		Thread t2 = new Thread(() -> obj.payment());
		Thread t3 = new Thread(() -> obj.theatre());

		Thread t4 = new Thread(() -> obj.restartOrder());
		Thread t5 = new Thread(() -> obj.restartAll());

		t1.start();
		t2.start();
		t3.start();

		Thread.sleep(5000);

		t4.start();

		Thread.sleep(3000);

		t5.start();
	}
}