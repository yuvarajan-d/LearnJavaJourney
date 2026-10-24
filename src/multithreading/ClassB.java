package multithreading;

public class ClassB {
	
	synchronized void methodB(ClassA a) {
		System.out.println("Thread B...");
		a.A();
	}
	
	synchronized void B() {
		System.out.println("Deadlock B");
	}

}
