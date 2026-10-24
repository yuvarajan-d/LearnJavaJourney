package multithreading;

public class Deadlock {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA classa= new ClassA();
		
		ClassB classb = new ClassB();
		
		Thread t1 = new Thread(()->{
			classa.methodA(classb);
		});

		Thread t2 = new Thread(()->{
			classb.methodB(classa);
		});
		
		t1.start();
		t2.start();
	}

}
