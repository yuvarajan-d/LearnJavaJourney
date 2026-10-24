package multithreading;

public class ClassA {
	
	synchronized void methodA(ClassB b) {
		System.out.println("Thread A...");
		b.B();
	}
	
	synchronized void A() {
		System.out.println("Deadlock A");
	}

}
